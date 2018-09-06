package ca.on.gov.common.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.StringUtils;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import ca.on.gov.common.config.SessionConfig;
import ca.on.gov.common.model.session.Session;
import ca.on.gov.common.service.SessionService;
import ca.on.gov.common.service.client.session.CloseSession;
import ca.on.gov.common.service.client.session.CloseTransaction;
import ca.on.gov.common.service.client.session.CreateSession;
import ca.on.gov.common.service.client.session.CreateSessionResponse;
import ca.on.gov.common.service.client.session.CreateTransaction;
import ca.on.gov.common.service.client.session.CreateTransactionResponse;
import ca.on.gov.common.service.client.session.ObjectFactory;

public class SessionServiceImpl extends WebServiceGatewaySupport implements SessionService {

	private static final Logger log = LoggerFactory.getLogger(SessionServiceImpl.class);

	@Autowired
	@Qualifier("sessionConfig")
	SessionConfig sessionConifg;

	@Override
	public Session getSessionByTransactionId(String transactionId) {
		return null;
	}

	@Override
	public Session createSession(Session session) {
		ObjectFactory sessionObjFactory = new ObjectFactory();
		CreateSession createSession = sessionObjFactory.createCreateSession();
		BeanUtils.copyProperties(session, createSession);
		createSession.setChannelId(session.getChannelID());
		createSession.setLanguageCode(session.getLanguage());
		createSession.setInternetIpAddress(session.getIpAddress());
		createSession.setSessionType(session.getProductBundle());
		createSession.setDeviceType(session.getDeviceClass());
		CreateSessionResponse sessionResponse = (CreateSessionResponse)getWebServiceTemplate().marshalSendAndReceive(createSession);
		session.setSessionId(Long.toString(sessionResponse.getCreateSessionReturn()));
		return session;
	}

	@Override
	public Session createTransaction(Session session) {
		if(StringUtils.isEmpty(session.getSessionId())){
			createSession(session);
		}
		ObjectFactory transactionObjFactory = new ObjectFactory();
		CreateTransaction createTransaction = transactionObjFactory.createCreateTransaction();
		createTransaction.setSessionId(Long.valueOf(session.getSessionId()));
		createTransaction.setTransactionKey(session.getTransactionKey());
		CreateTransactionResponse transactionResponse = (CreateTransactionResponse)getWebServiceTemplate().marshalSendAndReceive(sessionConifg.getTransactionTargetUrl(), createTransaction);
		session.setTransactionId(Long.toString(transactionResponse.getCreateTransactionReturn()));
		return session;
	}

	@Override
	public void closeTransaction(String transactionId) {
		CloseTransaction closeTransaction = new CloseTransaction();
		closeTransaction.setTransactionId(Long.valueOf(transactionId));
		getWebServiceTemplate().marshalSendAndReceive(closeTransaction);
	}

	@Override
	public void closeSession(String sessionId) {
		CloseSession closeSession = new CloseSession();
		closeSession.setSessionId(Long.valueOf(sessionId));
		getWebServiceTemplate().marshalSendAndReceive(closeSession);
	}

}
