package ca.on.gov.common.config.ws;

import javax.net.ssl.SSLContext;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.ssl.SSLContextBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender.RemoveSoapHeadersInterceptor;

import ca.on.gov.common.config.SessionConfig;
import ca.on.gov.common.service.impl.SessionServiceImpl;

@Configuration
@EnableConfigurationProperties(SessionConfig.class)
public class WebServiceConfiguration {

	private static final Logger log = LoggerFactory.getLogger(WebServiceConfiguration.class);

	@Autowired
	SessionConfig sessionConfig;

	@Bean
	public Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
		jaxb2Marshaller.setPackagesToScan( "ca.on.gov.common.service.client.email",
				"ca.on.gov.common.service.client.session",
				"ca.on.gov.common.service.client.transaction");
		return jaxb2Marshaller;
	}

	@Bean(name = "sessionService")
	public SessionServiceImpl sessionServiceImpl() throws Exception{
		SessionServiceImpl sessionServiceImpl = new SessionServiceImpl();
		sessionServiceImpl.getWebServiceTemplate().setDefaultUri( sessionConfig.getTargetUrl());
		sessionServiceImpl.setMarshaller(this.jaxb2Marshaller());
		sessionServiceImpl.setUnmarshaller(this.jaxb2Marshaller());
		sessionServiceImpl.setMessageSender(httpComponentsMessageSender());
		return sessionServiceImpl;
	}

	@Bean
	public HttpComponentsMessageSender httpComponentsMessageSender() throws Exception {
		HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
		httpComponentsMessageSender.setHttpClient(httpClient());
		return httpComponentsMessageSender;
	}

	@Bean
	public HttpClient httpClient() throws Exception{
		return HttpClientBuilder.create().setSSLSocketFactory(sslConnectionSocketFactory())
				.addInterceptorFirst(new RemoveSoapHeadersInterceptor()).build();
	}

	@Bean
	public SSLConnectionSocketFactory sslConnectionSocketFactory() throws Exception {
		return new SSLConnectionSocketFactory(sslContext(), NoopHostnameVerifier.INSTANCE);
	}

	@Bean
	public SSLContext sslContext() throws Exception {
		return SSLContextBuilder.create().loadTrustMaterial(new TrustAllStrategy()).build();
	}
}
