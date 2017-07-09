package me.helllp.demo.springCloudHystrixRibbon;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
@EnableHystrixDashboard
@SpringCloudApplication
public class HystrixRibbonApp {
	public static void main(String[] args) {
		SpringApplication.run(HystrixRibbonApp.class, args);
	}
	
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
