package ca.on.gov.common.model.session;

import java.io.Serializable;

public class UserProfile implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String onekeyPID;
	private String onekeyPmiID;
	private String firstName;
	private String lastName;
	private String primaryEmail;
	private boolean primaryEmailValid = false;
	private String secondaryEmail;
	private boolean secondaryEmailValid = false;
	private String prefLanguage = "EN";
	private boolean receiveNews = false;
	private boolean ccSecondary = true;
	private String reminderSchedule = "reminderSchedule";
	
	
	public String getOnekeyPID() {
		return onekeyPID;
	}
	public void setOnekeyPID(String onekeyPID) {
		this.onekeyPID = onekeyPID;
	}
	public String getOnekeyPmiID() {
		return onekeyPmiID;
	}
	public void setOnekeyPmiID(String onekeyPmiID) {
		this.onekeyPmiID = onekeyPmiID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	public boolean isPrimaryEmailValid() {
		return primaryEmailValid;
	}
	public void setPrimaryEmailValid(boolean primaryEmailValid) {
		this.primaryEmailValid = primaryEmailValid;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
	public boolean isSecondaryEmailValid() {
		return secondaryEmailValid;
	}
	public void setSecondaryEmailValid(boolean secondaryEmailValid) {
		this.secondaryEmailValid = secondaryEmailValid;
	}
	public String getPrefLanguage() {
		return prefLanguage;
	}
	public void setPrefLanguage(String prefLanguage) {
		this.prefLanguage = prefLanguage;
	}
	public boolean isReceiveNews() {
		return receiveNews;
	}
	public void setReceiveNews(boolean receiveNews) {
		this.receiveNews = receiveNews;
	}
	public boolean isCcSecondary() {
		return ccSecondary;
	}
	public void setCcSecondary(boolean ccSecondary) {
		this.ccSecondary = ccSecondary;
	}
	public String getReminderSchedule() {
		return reminderSchedule;
	}
	public void setReminderSchedule(String reminderSchedule) {
		this.reminderSchedule = reminderSchedule;
	}
	
	
}
