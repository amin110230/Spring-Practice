package org.amin.springpractice;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
		// call when application event published [framework related event]
		System.out.println(applicationEvent.toString());
	}

}
