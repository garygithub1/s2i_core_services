package ca.on.gov.common.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import ca.on.gov.common.jwt.impl.JwtCompImpl;

public class JwtConfig {
    private final Logger logger = LoggerFactory.getLogger(JwtConfig.class);
    
    //TODO support env and cloud service switch
    @Autowired
    private Environment env;
    
    //TODO collect error code to constants
    @Bean
    //@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
    //@Lazy(value = true)
    public JwtComp jwtComp() {
        //return new TdctFixedLengthReport(sourceSystem, dao);
        String jwtType = env.getProperty("jwt.type");
        logger.warn(jwtType);
        if ( jwtType == null ) {
            throw new RuntimeException("CODE-JWT-0002:jwt.type is not set");
            //jwtType = "EC";
        }
        
        JwtComp jwtComp = null;
        if ( "EC".equalsIgnoreCase(jwtType) ) {
            jwtComp = new JwtCompImpl(jwtType);
        } else {
            //clientPublicKey = type;
            throw new RuntimeException("unsupported type");
        }
        
        return jwtComp;
    }
}
