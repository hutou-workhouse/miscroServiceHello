package me.helllp.demo.springbootDemo3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 在ApplicationContext完成初始化工作之后执行
 * 
 * @author linxm
 *
 */
@Component
@Order(value=1)
public class MyCommandRunner1 implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===========执行命令1的逻辑！=================");
	}

}
