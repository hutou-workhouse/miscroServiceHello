package me.helllp.demo.springbootDemo1;

import org.springframework.boot.SpringApplication;

/**
 * 这是演示的例子，可以通过参数指定启动端口
 * 	--server.port=8020
 * 
 * @author hutou
 */
public class App {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunner.class, args);
	}
}
