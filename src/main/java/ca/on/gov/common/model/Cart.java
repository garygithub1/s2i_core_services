package ca.on.gov.common.model;

import java.io.Serializable;

public class Cart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public enum Status{
		CREATED(),
		PRE_AUTH_REDIRECT_ATTEMPTED(),
		PRE_AUTH_SUCCESSFUL(),
		FULLFILMENT_FAILED(),
		FULLFILMENT_SUCCEED;
		
		Status(){}
	}
	
	private long timestamp = 0;
	private long count = 0;
	private String transactionId;
	private String paymentType;
	
	

}
