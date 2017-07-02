package me.helllp.demo.springbootStarter.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advices {
	
	private static final Logger logger = LoggerFactory.getLogger(Advices.class);  
	
	@Pointcut("execution(* me.helllp.demo.springbootStarter.SpringBootRunner.*(..))")
	public void controllerMethodPointcut(){} 
	
	@Around("controllerMethodPointcut()")
	public Object before(ProceedingJoinPoint pjp) {
        long beginTime = System.currentTimeMillis();  
        MethodSignature signature = (MethodSignature) pjp.getSignature();  
        Method method = signature.getMethod(); //获取被拦截的方法  
        String methodName = method.getName(); //获取被拦截的方法名  
          
        logger.info("请求开始，方法：{}", methodName);  
          
        Object result = null;  
  
        Object[] args = pjp.getArgs();  
        for(Object arg : args){  
        	logger.info(arg.toString());
        }  
          
        try {  
               result = pjp.proceed();  
        } catch (Throwable e) {  
            logger.info("exception: ", e);  
        }  
          
        long costMs = System.currentTimeMillis() - beginTime;  
        logger.info("{}请求结束，耗时：{}ms", methodName, costMs);  
          
        return result; 
	}
}
