package me.helllp.demo.springbootDemo2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = { "me.helllp.demo.springbootDemo2, me.helllp.demo.test" })
@Import(me.helllp.demo.test2.OtherConfig.class)
public class SpringBootRunner {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> hello() {
		System.out.println("hello rest service");
		return new ResponseEntity<String>("我的测试，Hello World！", HttpStatus.OK);
	}
}
