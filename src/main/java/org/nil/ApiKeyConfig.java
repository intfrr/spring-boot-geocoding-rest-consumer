package org.nil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

//@Configuration
//@PropertySource("classpath:apikey.properties")
//@PropertySource("classpath:application.properties")
public class ApiKeyConfig /*implements EnvironmentAware */{
//
////	@Value("${apiKey}")
//	@Value("${google.map.api.key}")
////  private String endPoint;
//	private String apiKey;
//
//	private Environment environment;
//
//	@Override
//	public void setEnvironment(final Environment environment) {
//		this.environment = environment;
//	}
//
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer getPropertyConfig() {
//		return new PropertySourcesPlaceholderConfigurer();
//	}
//
////	public void myMethod() {
////		final String apiKeyValue = environment.getProperty("google.map.api.key");
////		// ...
////	}
//
}
