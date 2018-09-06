package ca.on.gov.common.exception.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties( { "stackTrace", "cause", "localizedMessage", "suppressed", "status", "message" })
public class AppException extends RuntimeException {
    private static final long serialVersionUID = 6319102511504010370L;
    
    private List<AppError> errors = null;
    
    public AppException(String code, String desc) {
        errors = new ArrayList<AppError>();
        errors.add(new AppError(code, desc));
    }
    
    public AppException(Map<String, String> errorMap) {
        errors = new ArrayList<AppError>();
        for (Map.Entry<String, String> entry : errorMap.entrySet())
        {
            errors.add(new AppError(entry.getKey(), entry.getValue()));
        }
    }
    
    public AppException(List<AppError> errors) {
        this.errors = errors;
    }

    public List<AppError> getErrors() {
        return errors;
    }

    public void setErrors(List<AppError> errors) {
        this.errors = errors;
    }

    public void deal() {
        throw this;
    }

    @Override
    public String toString() {
        return "AppException [errors=" + errors + "]";
    }
}