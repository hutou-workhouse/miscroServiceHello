package me.helllp.demo.springCloudHystrixRibbon.web;

import me.helllp.demo.springCloudHystrixRibbon.service.HystrixRibbonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	HystrixRibbonService helloService;
	
	@RequestMapping("/hi")
	public String hello(){
		return helloService.helloService("姓名");
	}
}
