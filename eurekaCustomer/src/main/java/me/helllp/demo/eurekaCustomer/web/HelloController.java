package me.helllp.demo.eurekaCustomer.web;

import me.helllp.demo.eurekaCustomer.service.FeignService;
import me.helllp.demo.eurekaCustomer.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;
	
	@Autowired
	FeignService feignService;
	
	@RequestMapping("/hi")
	public String hello(){
		return helloService.helloService("姓名");
	}
	
	@RequestMapping("/hifeign")
	public String helloFeign(){
		return feignService.sayHiUseFeign("Feign姓名");
	}
}
