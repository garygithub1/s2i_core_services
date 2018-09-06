package ca.on.gov.common.exception;

import org.springframework.context.annotation.Bean;

import ca.on.gov.common.exception.impl.ExceptionCompImpl;

public class ExceptionConfig {
    
    //TODO collect error code to constants
    @Bean
    public ExceptionComp exceptionComp() {
        ExceptionComp exceptionComp = new ExceptionCompImpl();
        
        return exceptionComp;
    }
}
