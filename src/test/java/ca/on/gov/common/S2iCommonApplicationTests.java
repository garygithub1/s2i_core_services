package ca.on.gov.common;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ca.on.gov.common.model.session.Session;
import ca.on.gov.common.model.session.UserProfile;
import ca.on.gov.common.service.SessionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class S2iCommonApplicationTests {

	@Autowired
	@Qualifier("sessionService")
	SessionService sessionService;

	@Test
	public void contextLoads() {
		Session session = new Session();
		UserProfile userProfile = new UserProfile();
		userProfile.setFirstName( "First");
		userProfile.setLastName( "Last");
		userProfile.setCcSecondary( false);
		userProfile.setOnekeyPID( "fakedtestid123");
		session.setChannelID( "ESDI");
		session.setDeviceClass( "desktop");
		session.setIpAddress( "127.0.0.1");
		session.setLanguage( "en");
		session.setProductBundle( "DVS");
		session.setTransactionKey( "DVS");
		session.setUserAgent( "TestCase");
		session.setUserProfile(userProfile);
		sessionService.createTransaction(session);

		assertNotNull(session.getTransactionId());
	}

}
