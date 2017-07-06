package me.helllp.demo.springbootStarter.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置跨域访问
 * @author linxm
 *
 */
@Configuration
//@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedOrigins("http://www.baidu.com")
			.allowedMethods("GET","PUT","POST","DELETE");
	}
}
