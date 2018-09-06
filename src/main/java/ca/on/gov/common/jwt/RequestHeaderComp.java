package ca.on.gov.common.jwt;

import javax.servlet.http.HttpServletRequest;

import ca.on.gov.common.jwt.model.RequestHeader;

public interface RequestHeaderComp {
    //combine "create transaction" and "return jwt token"
    //public String genAuth();//String txId
    
    //check jwt token, get client ip , merge into esb-restful header
    //not allow null, not allow expired
    public RequestHeader parse(HttpServletRequest request);
}
