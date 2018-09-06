package ca.on.gov.common.jwt.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import ca.on.gov.common.jwt.JwtComp;
import ca.on.gov.common.jwt.RequestHeaderComp;
import ca.on.gov.common.jwt.model.RequestHeader;
import io.jsonwebtoken.Claims;

public class RequestHeaderCompImpl implements RequestHeaderComp {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    
    public RequestHeaderCompImpl() {
    }

    @Autowired
    private JwtComp jwtComp;
    

    @Override
    public RequestHeader parse(HttpServletRequest request) {
        RequestHeader requestHeader = this.initEmpty(request);

        String jwt = request.getHeader("Authorization");
        Claims claims = jwtComp.decode(jwt, true);
        requestHeader.setTransactionId(claims.get("txId").toString());//TODO jwt or other
        
        return requestHeader;
    }
    
    private RequestHeader initEmpty(HttpServletRequest request) {
        RequestHeader requestHeader = new RequestHeader();

        requestHeader.setInternetIPAddress( request.getHeader("X-FORWARDED-FOR") );
        
        String channelId = request.getHeader("ChannelId");//"Internet" "Simulator"
        if ( channelId==null ) {
            channelId = "Internet";
        }
        requestHeader.setChannelId(channelId);
        String language = request.getHeader("Language");
        if ( language==null ) {
            language = "EN";
        }
        requestHeader.setLanguage(language);
        //TODO device desktop or others
        
        requestHeader.setTimestamp(sdf.format(new Date()));//"2015-07-13T15:44:40"

        requestHeader.setTerminalId("X");
        //TODO confirm MCBS
        requestHeader.setServiceProviderCode("MCBS");
        
        return requestHeader;
    }

    /*
    public void setJwtComp(JwtComp jwtComp) {
        this.jwtComp = jwtComp;
    }*/
    
}
