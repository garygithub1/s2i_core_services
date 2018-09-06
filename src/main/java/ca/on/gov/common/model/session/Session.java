package ca.on.gov.common.model.session;

import java.io.Serializable;

public class Session implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public String channelID = "Internet";
	/**
	 * request browser device type, ie: unsupported,desktop,tablet,mobile
	 */
	public String deviceClass = "desktop";
	public String ipAddress = "127.0.0.1";
	public String language = "en";
	public boolean persist = false;

	public String productBundle;
	public String sessionId;
	public String transactionId;
	public String transactionKey;
	public String userAgent;
	public UserProfile userProfile;

	public String getChannelID() {
		return channelID;
	}
	public void setChannelID(String channelID) {
		this.channelID = channelID;
	}
	public String getDeviceClass() {
		return deviceClass;
	}
	public void setDeviceClass(String deviceClass) {
		this.deviceClass = deviceClass;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isPersist() {
		return persist;
	}
	public void setPersist(boolean persist) {
		this.persist = persist;
	}
	public String getProductBundle() {
		return productBundle;
	}
	public void setProductBundle(String productBundle) {
		this.productBundle = productBundle;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionKey() {
		return transactionKey;
	}
	public void setTransactionKey(String transactionKey) {
		this.transactionKey = transactionKey;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public UserProfile getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
    @Override
    public String toString() {
        return "Session [channelID=" + channelID + ", deviceClass=" + deviceClass + ", ipAddress=" + ipAddress
                + ", language=" + language + ", persist=" + persist + ", productBundle=" + productBundle
                + ", sessionId=" + sessionId + ", transactionId=" + transactionId + ", transactionKey=" + transactionKey
                + ", userAgent=" + userAgent + ", userProfile=" + userProfile + "]";
    }

}
