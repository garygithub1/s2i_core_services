package ca.on.gov.common.service;

import ca.on.gov.common.model.session.Session;

/**
 * @author hange1
 *
 */
public interface SessionService {
	
	/**
	 * get Session object associated with the transactionId
	 * 
	 * @param transactionId
	 * @return ca.on.gov.common.model.Session
	 */
	Session getSessionByTransactionId(String transactionId);
	
	/**
	 * create Session based on the intake Session object
	 * 
	 * @param session
	 * @return ca.on.gov.common.model.Session
	 */
	Session createSession(Session session);
	
	/**
	 * create transactionId associated with the incoming sessionId
	 * 
	 * @param session
	 * @return
	 */
	Session createTransaction(Session session);
	
	/**
	 * close the transaction
	 * 
	 * @param transactionId
	 */
	void closeTransaction(String transactionId);
	
	/**
	 * close the session by sessionId
	 * 
	 * @param transactionId
	 */
	void closeSession(String sessionId);

}
