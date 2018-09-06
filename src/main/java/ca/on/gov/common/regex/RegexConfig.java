package ca.on.gov.common.regex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import ca.on.gov.common.regex.impl.RegexCompImpl;

public class RegexConfig {
    private final Logger logger = LoggerFactory.getLogger(RegexConfig.class);
    
    //TODO support env and cloud service switch
    @Autowired
    private Environment env;
    
    //TODO collect error code to constants
    @Bean
    public RegexComp regexComp() {
        if ( env==null ) {
            logger.info("env is null");
        }
        RegexComp regexComp = new RegexCompImpl();
        
        return regexComp;
    }
}
