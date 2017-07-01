package me.helllp.demo.springbootDemo3;

import org.springframework.context.ApplicationListener;

public class MyStartListner implements ApplicationListener<MyTellEvent> {

	@Override
	public void onApplicationEvent(MyTellEvent event) {
		event.pring();
	}

}
