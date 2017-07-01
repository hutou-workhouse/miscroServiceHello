package me.helllp.demo.springbootDemo3;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义的测试用事件，发送一个消息
 * 
 * @author linxm
 *
 */
@SuppressWarnings("serial")
public class MyTellEvent extends ApplicationEvent{
	private String message;
	
	public MyTellEvent(Object source) {
		super(source);
	}

	public MyTellEvent(Object source,String message){
		super(source);
		this.message = message;
	}
	
	public void pring(){
		System.out.println("事件的消息：" + message);
	}
}
