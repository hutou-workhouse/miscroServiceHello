package me.helllp.demo.springbootDemo2;

import me.helllp.demo.test.MyCondition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration  
public class Config  
{  
	/**
	 * 如果MyCondition中match返回ture则可以注入Bean；否则不能注入
	 * 
	 * @return
	 */
    @Bean
    @Conditional(MyCondition.class)
    public String osName(){  
        return "=========windows！============";  
    }  
}  