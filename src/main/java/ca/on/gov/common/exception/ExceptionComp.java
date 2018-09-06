package ca.on.gov.common.exception;

import java.util.Map;

public interface ExceptionComp {
    public void throwException(Map<String, String> map, boolean backup);
    
    public void throwException(String code, String desc, boolean backup);
}
