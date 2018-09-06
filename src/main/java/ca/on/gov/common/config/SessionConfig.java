package ca.on.gov.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("sessionConfig")
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "common.session")
public class SessionConfig {

	private String targetUrl;
	private String transactionTargetUrl;

	public String getTargetUrl() {
		return targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	public String getTransactionTargetUrl() {
		return transactionTargetUrl;
	}
	public void setTransactionTargetUrl(String transactionTargetUrl) {
		this.transactionTargetUrl = transactionTargetUrl;
	}


}
