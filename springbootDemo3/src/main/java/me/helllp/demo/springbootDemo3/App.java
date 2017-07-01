package me.helllp.demo.springbootDemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class App {
	public static void main(String[] args) {
		SpringApplication bootstrap = new  SpringApplication(SpringBootRunner.class);

		bootstrap.addListeners(new MyStartListner());
		//	对Context进行最后的设置工作
		bootstrap.addInitializers(new MyContextInitializer());
		//	增加命令
		
		ConfigurableApplicationContext context = bootstrap.run(args);

		//	触发一个事件
		MyTellEvent event = new MyTellEvent(context, "测试的事件信息");
		context.publishEvent(event);
	}
}
