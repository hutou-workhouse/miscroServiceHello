package me.helllp.demo.springbootDemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiuration {
	@Bean
	public TestLogic myLogik(){
		return new TestLogic(myService());
	}
	
	@Bean
	public TestService myService(){
		return new TestService();
	}
}
