package me.helllp.demo.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {
	@Bean
	public String testImportResource(){
		return "测试一下加载其他系统的配置";
	}
}
