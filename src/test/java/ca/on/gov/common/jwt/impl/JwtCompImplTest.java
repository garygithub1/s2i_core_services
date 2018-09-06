package ca.on.gov.common.jwt.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ca.on.gov.common.jwt.JwtComp;
import ca.on.gov.common.jwt.impl.JwtCompImpl;
import io.jsonwebtoken.Claims;

public class JwtCompImplTest {
    private final Logger logger = LoggerFactory.getLogger(JwtCompImplTest.class);
    
    private JwtComp jwtComp;
    
    //@BeforeClass
    @Before
    public void runBeforeTestMethod() {
        jwtComp = new JwtCompImpl("ec");
        logger.info("runBeforeTestMethod");
    }

    @Test
    public void testEncode() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "andy");
        map.put("gender", "male");
        String jwt = jwtComp.encode(map, calExp(0));
        logger.info("jwt:"+jwt);

        Claims claims = jwtComp.decode(jwt, false);
        logger.debug("decode:" + claims.get("name"));
    }
    
    //TODO util
    private Date calExp(int expType) {

        Date dt = new Date();
        Calendar c = Calendar.getInstance(); 
        c.setTime(dt);
        
        if ( expType==0 ) {//for all claim
            //c.add(Calendar.DATE, 1);
            c.add(Calendar.MINUTE, 60);
            dt = c.getTime();
        } else if ( expType==1 ) {//only for token
            c.add(Calendar.DATE, 300);
            //c.add(Calendar.MINUTE, 20);
            dt = c.getTime();
        } else if ( expType==2 ) {//only for challengeId
            c.add(Calendar.MINUTE, 1);
            dt = c.getTime();
        }
        
        return dt;
    }
}
