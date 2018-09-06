package ca.on.gov.common.exception.impl;

import java.util.Map;

import ca.on.gov.common.exception.ExceptionComp;
import ca.on.gov.common.exception.model.AppException;

public class ExceptionCompImpl implements ExceptionComp {

    @Override
    public void throwException(Map<String, String> map, boolean backup) {
        //List<AppError> errors = new ArrayList<AppError>();

        AppException appException = new AppException(map);
        
        throw appException;
    }

    @Override
    //TODO implement backup
    public void throwException(String code, String desc, boolean backup) {
        AppException appException = new AppException(code, desc);
        
        throw appException;
    }

}
