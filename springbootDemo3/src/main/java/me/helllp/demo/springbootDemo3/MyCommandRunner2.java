package me.helllp.demo.springbootDemo3;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=2)
public class MyCommandRunner2 implements CommandLineRunner, ApplicationContextAware{

	private ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context = applicationContext;
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("=============命令2，可以使用ApplicationContext====" + context);
	}
}
