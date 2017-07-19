package me.helllp.demo.springCloudSleuthService2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodController {
	@Autowired
	private HelloService service;
	
	@RequestMapping("/hello")
	public String hello(@RequestParam String name){
		return "test " + service.helloService(name);
	}
}
