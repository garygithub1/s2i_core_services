package ca.on.gov.common.jwt.impl;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ca.on.gov.common.jwt.JwtComp;
import ca.on.gov.common.jwt.JwtConfig;
import ca.on.gov.common.jwt.RequestHeaderComp;
import ca.on.gov.common.jwt.RequestHeaderConfig;
import ca.on.gov.common.jwt.model.RequestHeader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RequestHeaderConfig.class, JwtConfig.class})
//@SpringApplicationConfiguration(classes = ExampleApplication.class)
@TestPropertySource(locations="classpath:test.properties")
public class RequestHeaderCompImplTest {
    private final Logger logger = LoggerFactory.getLogger(RequestHeaderCompImplTest.class);

    @Autowired
    private RequestHeaderComp requestHeaderComp;

    @Autowired(required = false)
    private JwtComp jwtComp;
    
    //@BeforeClass
    @Before
    public void runBeforeTestMethod() {
        logger.info("runBeforeTestMethod");
    }

    @Test
    public void testParse() {
        String txId = "tx000001";
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "andy");
        map.put("gender", "male");
        map.put("txId", txId);
        String jwtToken = jwtComp.encode(map, null);
        
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addHeader("Authorization", jwtToken);
        request.addHeader("ChannelId", "simulator");
        request.addHeader("X-FORWARDED-FOR", "3.3.3.3");
        
        RequestHeader requestHeader = requestHeaderComp.parse(request);
        logger.debug( requestHeader.toString() );
        assertEquals("should equal", txId, requestHeader.getTransactionId());
    }

}
