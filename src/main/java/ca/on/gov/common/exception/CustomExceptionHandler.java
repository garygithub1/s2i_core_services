package ca.on.gov.common.exception;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import ca.on.gov.common.exception.model.AppException;

//TODO work
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({ ConstraintViolationException.class })
    public ResponseEntity<Object> handleConstraintViolation(ConstraintViolationException ex, WebRequest request) {
        AppException appException = new AppException("Code-ConstraintViolation", ex.getMessage());
        
        return new ResponseEntity<Object>(appException, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
                                                                  HttpHeaders headers, HttpStatus status,
                                                                  WebRequest request) {
        AppException appException = new AppException("Code-HttpMessageNotReadable", ex.getMessage());
        
        return new ResponseEntity<Object>(appException, new HttpHeaders(), HttpStatus.BAD_REQUEST);
        //return response(ex, request, HttpStatus.BAD_REQUEST, errorMessage);
    }

    @ExceptionHandler({ AppException.class })
    public ResponseEntity<Object> handleAppException(AppException ex, WebRequest request) {
        
        return new ResponseEntity<Object>(ex, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
