package ca.on.gov.common.service;

import java.util.Map;

import ca.on.gov.common.model.Customer;
import ca.on.gov.common.model.email.Attachement;

public interface EmailService {
	
	/**
	 * Send standard email
	 * 
	 * @param email
	 * @param ca.on.gov.common.model.Customer
	 * @param template
	 * @param ca.on.gov.common.model.email.Attachement[]
	 * @param params
	 */
	public void sendEmail(String email, Customer customer, String template, Attachement[] attachments, Map<String, String> params);

}
