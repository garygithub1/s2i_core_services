package ca.on.gov.common.service;

import ca.on.gov.common.model.Session;

public interface CommonService {
	
	Session getSessionByTransactionId(String transactionId);

}
