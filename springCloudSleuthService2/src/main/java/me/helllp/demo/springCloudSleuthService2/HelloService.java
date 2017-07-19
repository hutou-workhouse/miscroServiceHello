package me.helllp.demo.springCloudSleuthService2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
	private static final String SERVICE_NAME = "springCloudSleuthService1";

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	public String helloService(String name) {
		ServiceInstance serviceInstance = this.loadBalancerClient
				.choose(SERVICE_NAME);
		System.out.println("服务主机：" + serviceInstance.getHost());
		System.out.println("服务端口：" + serviceInstance.getPort());

		// 通过服务名来访问
		return restTemplate.getForObject("http://" + SERVICE_NAME
				+ "/base?name=" + name, String.class);
	}

}
