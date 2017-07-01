package me.helllp.demo.springbootDemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MyRunListener implements SpringApplicationRunListener{

	public MyRunListener(SpringApplication application, String[] args) {
	}
	
	@Override
	public void starting() {
		System.out.println("============MyRunListener starting==========");
	}

	@Override
	public void environmentPrepared(ConfigurableEnvironment environment) {
		System.out.println("============MyRunListener environmentPrepared==========");		
	}

	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
		System.out.println("============MyRunListener contextPrepared==========");		
	}

	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
		System.out.println("============MyRunListener contextLoaded==========");		
	}

	@Override
	public void finished(ConfigurableApplicationContext context,
			Throwable exception) {
		System.out.println("============MyRunListener finished==========");		
	}

}
