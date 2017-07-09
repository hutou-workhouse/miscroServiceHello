package me.helllp.demo.springCloudHystrixRibbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixRibbonService {
	private static final String SERVICE_NAME = "EUREKACLIENT";
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@HystrixCommand(fallbackMethod = "helloServiceFallBack")
    public String helloService(String name) {
		ServiceInstance serviceInstance = this.loadBalancerClient.choose(SERVICE_NAME);
		System.out.println("服务主机：" + serviceInstance.getHost());
		System.out.println("服务端口：" + serviceInstance.getPort());
		
    	//	通过服务名来访问
        return restTemplate.getForObject("http://" + SERVICE_NAME + "/hello?name="+name,String.class);
    }

	@SuppressWarnings("unused")
	private String helloServiceFallBack(String name) {
		return "这个是失败的信息！";
	}
}
