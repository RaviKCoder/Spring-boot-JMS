package com.ravi.runners;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReceiverApp  {

	@JmsListener(destination="testmq1")
	public void readMessage(String message) {
		System.out.println("Recived message is: "+message);
	}
	 
	

}
