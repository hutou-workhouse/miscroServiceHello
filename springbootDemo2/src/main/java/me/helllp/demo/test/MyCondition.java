package me.helllp.demo.test;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition{
    /** 
     * 如果是windows系统，返回true；否则返回false 
     */  
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata){  
        return context.getEnvironment().getProperty("os.name").contains("Windows");  
    }  
}
