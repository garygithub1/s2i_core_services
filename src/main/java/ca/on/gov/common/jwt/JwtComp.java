package ca.on.gov.common.jwt;

import java.util.Date;
import java.util.Map;

import io.jsonwebtoken.Claims;

public interface JwtComp {
    public static final String ERROR_CODE_0001 = "CODE-JWT-0001";//public key can not init
    public static final String ERROR_CODE_0002 = "CODE-JWT-0002";//expired token
    public static final String ERROR_CODE_0003 = "CODE-JWT-0003";//wrong format token
    
    public String encode(Map<String, Object> content, Date exp);

    public Claims decode(String jwt, boolean strict);
    
    public String getServerPublicKey();

    //for client public key
    public Claims decode(String jwt, String publicKeyText, boolean strict);
    
    //public String readResourceKeyWithReturn(String fileName);
}
