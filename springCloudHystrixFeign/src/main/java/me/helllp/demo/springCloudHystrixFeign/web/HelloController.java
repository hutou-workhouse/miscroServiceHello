package me.helllp.demo.springCloudHystrixFeign.web;

import me.helllp.demo.springCloudHystrixFeign.service.HystrixFeignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	HystrixFeignService helloService;
	
	@RequestMapping("/hifeign")
	public String hello(){
		return helloService.sayHiUseFeign("姓名");
	}
}
