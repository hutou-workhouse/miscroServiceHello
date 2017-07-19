package me.helllp.demo.springCloudSleuthService1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodController {
	
	@RequestMapping("/base")
	public String hello(@RequestParam String name){
		return "base Hello " + name;
	}
}
