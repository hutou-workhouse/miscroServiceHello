package me.helllp.demo.springbootDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootRunner.class, args);
		
		Object o = context.getBean("myService");
		System.out.println(o.getClass().getName());
		
		o = context.getBean("myLogik");
		System.out.println(o.getClass().getName());
		
		//	来自其他的包，通过@ComponentScan进行了配置
		//	注入了配置文件
		o = context.getBean("getDemoBean");
		System.out.println(o);
		
		//	测试通过@Import加载的配置是否生效
		o = context.getBean("testImportResource");
		System.out.println(o); 
	}
}
