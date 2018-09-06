package ca.on.gov.common.exception.model;

import java.util.List;

public class AppExceptionResponse {
    private List<AppError> errors;

    public List<AppError> getErrors() {
        return errors;
    }

    public void setErrors(List<AppError> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "AppExceptionResponse [errors=" + errors + "]";
    }
}