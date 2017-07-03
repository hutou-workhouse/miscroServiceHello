package me.helllp.demo.eurekaClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodController {
	@RequestMapping("/add")
	public Integer add(int a,int b){
		return a+b;
	}
	
	@RequestMapping("/sub")
	public Integer sub(int a, int b){
		return a-b;
	}
}
