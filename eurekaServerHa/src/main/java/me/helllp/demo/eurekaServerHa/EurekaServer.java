package me.helllp.demo.eurekaServerHa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * C:\Windows\System32\drivers\etc\hosts 127.0.0.1 master backup
 * java -jar xxx.jar --spring.profiles.active=master
 * java -jar xxx.jar --spring.profiles.active=backup
 * 
 * @author hutou
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
	}
}
