package me.helllp.demo.springbootStarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootRunner {
	
	private final static Logger logger = LoggerFactory.getLogger(App.class);
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> hello() {
		logger.info("hello rest service");
		
		return new ResponseEntity<String>("我的测试，Hello World！", HttpStatus.OK);
	}
}
