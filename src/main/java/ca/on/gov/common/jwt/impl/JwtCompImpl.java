package ca.on.gov.common.jwt.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.io.pem.PemReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.on.gov.common.exception.model.AppException;
import ca.on.gov.common.jwt.JwtComp;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

//default implement , using ec-sha256
public class JwtCompImpl implements JwtComp {
    private final Logger logger = LoggerFactory.getLogger(JwtCompImpl.class);

    private static PrivateKey ecPrivateKey;
    private static PublicKey ecPublicKey;
    private static String ecPublicKeyText;
    
    private PrivateKey serverPrivateKey;
    private PublicKey serverPublicKey;
    private String serverPublicKeyText;
    //just for wallet app
    //private String clientPublicKey;
    
    public JwtCompImpl(String type) {
        if ( "EC".equalsIgnoreCase(type) ) {
            if ( ecPrivateKey==null ) {
                ecPrivateKey = genEcPrivateKey();
            }
            serverPrivateKey = ecPrivateKey;
            if ( ecPublicKey==null ) {
                ecPublicKey = genEcPublicKey();
            }
            serverPublicKey = ecPublicKey;
            serverPublicKeyText = ecPublicKeyText;
        } else {
            //clientPublicKey = type;
            throw new RuntimeException("unsupported type");
        }
    }

    public String encode(Map<String, Object> content, Date exp) {
        String result = "token-key";
        
        if (exp == null) {
            Date dt = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(dt);
            c.add(Calendar.MINUTE, 60*24*100);
            dt = c.getTime();

            exp = dt;
        }

        try {
            //SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.RS256;
            SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.ES256;
            
            JwtBuilder builder = Jwts.builder().setHeaderParam("typ", "JWT")
                    //.setSubject("token")
                    .setIssuer("https://ontario.ca")
                    .signWith(signatureAlgorithm, serverPrivateKey);

            // jwt中需要传递的内容
            // builder.claim(tokenkey, tokenValue);
            for (Map.Entry<String, Object> entry : content.entrySet()) {
                String mapkey = entry.getKey();
                Object mapvalue = entry.getValue();
                builder.claim(mapkey, mapvalue);
            }
            
            builder.setExpiration(exp);// in jwt , they use seconds
            result = builder.compact();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        
        
        return result;
    }

    public Claims decode(String jwt, boolean strict) {
        Claims claims = null;

        try {
            JwtParser parser = Jwts.parser().setSigningKey(serverPublicKey);
            
            claims = parser.parseClaimsJws(jwt).getBody();
        } catch (ExpiredJwtException ex) {
            if ( strict ) {
                throw new AppException(ERROR_CODE_0002, "Token is expired");
            } else {
                claims = ex.getClaims();
            }
        } catch (Exception ex) {
            if ( strict ) {
                throw new AppException(ERROR_CODE_0003, "jwtToken format is wrong");
            } else {
                //default colse
                //ex.printStackTrace();
                logger.warn("Some error happened in jwt decoding.");
            }
        }
        
        return claims;
    }

    @Override
    public String getServerPublicKey() {
        return serverPublicKeyText;
    }

    @Override
    public Claims decode(String jwt, String publicKeyText, boolean strict) {
        return null;
    }
    
    //private String EC = "EC";
    
    private PrivateKey genEcPrivateKey() {
        //read private key
        //String key = readResourceKey("rsa_wallet_service_middle.pem");
        String txt = readResourceKey("ec_middle.pem");

        // 生成签名密钥
        //byte[] keyBytes = (new java.util.Base64()).decodeBuffer(key);
        byte[] keyBytes = Base64.getDecoder().decode(txt);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        //KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        KeyFactory keyFactory = null;
        PrivateKey privateKey = null;
        
        try {
            keyFactory = KeyFactory.getInstance("EC");
            privateKey = keyFactory.generatePrivate(keySpec);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("genEcPrivateKey error");
        }
        
        return privateKey;
    }
    
    private PublicKey genEcPublicKey() {
        String text = readResourceKeyWithReturn("ec_public.pem");
        ecPublicKeyText = text;
        
        Security.addProvider(new BouncyCastleProvider());
        Reader rdr = new StringReader(
                text
        ); // or from file etc.

        //TODO resource
        PublicKey key = null;
        
        PemReader pemReader = null;
        org.bouncycastle.util.io.pem.PemObject spki = null;
        try {
            pemReader = new org.bouncycastle.util.io.pem.PemReader(rdr);
            spki = pemReader.readPemObject();
            
            key = KeyFactory.getInstance("EC", "BC").generatePublic(new X509EncodedKeySpec(spki.getContent()));
        } catch (Exception ex) {
            throw new AppException(ERROR_CODE_0001, "Public key is wrong");
        } finally {
            if ( pemReader!=null ) {
                try {
                    pemReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        
        return key;
    }

    //TODO get public key text
    private String readResourceKeyWithReturn(String fileName) {
        //String prefix = System.getProperty("sodp.apps.s2i.workdirectory") + "/Config/gooseberry/";
        InputStream is = this.getClass().getResourceAsStream("/key/"+fileName);

        String key = null;
        try {
            //byte[] encoded = Files.readAllBytes(Paths.get(prefix + fileName));
            byte[] encoded = IOUtils.toByteArray(is);
            key = new String(encoded, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return key;
    }

    //TODO merge with readResourceKeyWithReturn
    private String readResourceKey(String fileName) {
        //String prefix = System.getProperty("sodp.apps.s2i.workdirectory") + "/Config/gooseberry/";
        InputStream is = this.getClass().getResourceAsStream("/key/"+fileName);
        File file = null;
        try {
            file = File.createTempFile("abc", "def");
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        String key = null;
        try {
            //File file = new File(prefix + fileName);
            FileUtils.copyInputStreamToFile(is, file);
            List<String> lines = FileUtils.readLines(file, Charset.defaultCharset());
            lines = lines.subList(1, lines.size() - 1);
            key = lines.stream().collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return key;
    }
}
