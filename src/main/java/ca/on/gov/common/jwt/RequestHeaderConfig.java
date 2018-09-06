package ca.on.gov.common.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import ca.on.gov.common.jwt.impl.RequestHeaderCompImpl;

public class RequestHeaderConfig {
    private final Logger logger = LoggerFactory.getLogger(RequestHeaderConfig.class);
    
    //TODO support env and cloud service switch
    @Autowired
    private Environment env;
    
    //TODO collect error code to constants
    @Bean
    public RequestHeaderComp requestHeaderComp() {
        if ( env==null ) {
            logger.info("env is null");
        }
        RequestHeaderComp requestHeaderComp = new RequestHeaderCompImpl();
        
        return requestHeaderComp;
    }
}
