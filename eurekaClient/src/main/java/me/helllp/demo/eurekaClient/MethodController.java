package me.helllp.demo.eurekaClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
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
	
	@Value("${myenv}")
	private String env="ddd";
	
	@RequestMapping("/config")
	public String config(){
		return env;
	}
}
