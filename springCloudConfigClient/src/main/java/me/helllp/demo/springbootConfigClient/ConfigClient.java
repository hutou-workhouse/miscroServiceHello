package me.helllp.demo.springbootConfigClient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClient.class).web(true).run(args);
	}
}
