package me.helllp.demo.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:me/helllp/demo/test/test.properties")
public class SomeConfig {
	@Value("${test.name}")
	private String user;
	
	@Value("${test.pass}")
	private String pass;
	
	@Bean
	public String getDemoBean(){
		return user + " " + pass;
	}
}
