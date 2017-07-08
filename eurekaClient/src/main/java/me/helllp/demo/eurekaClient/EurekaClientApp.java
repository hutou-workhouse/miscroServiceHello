package me.helllp.demo.eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApp {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApp.class, args);
	}
}
