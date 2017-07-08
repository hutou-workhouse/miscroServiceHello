package me.helllp.demo.springbootConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {
	@Value("${myenv}")
	private String env;
	
	@RequestMapping("/config")
	public String config(){
		return env;
	}
}
