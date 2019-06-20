package com.javainuse.controllers;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerController {
	
	@JmsListener(destination="Standalone.queue")
	public void consume(String message) {
		System.out.println("message is received:" +message);

	}

}
