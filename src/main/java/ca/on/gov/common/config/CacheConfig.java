package ca.on.gov.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;

@Configuration
@EnableConfigurationProperties
public class CacheConfig {

	@Autowired
	private ConfigProperties configProperties;

	@Bean
	public Config hazelCastConfig() {
		return new Config().setInstanceName( configProperties.instanceName)
				.addMapConfig(new MapConfig().setName( configProperties.sessionCacheName));
	}

}
