package me.helllp.demo.springCloudSleuth;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SleuthApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(SleuthApplication.class).run(args);
	}
}
