package com.ravi.runners;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SenderApp implements CommandLineRunner {

	@Autowired
	private JmsTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
	template.send("testmq1",ses->ses.createTextMessage("From sender: "+new Date()));
	System.out.println("Message sent successfully.");
	}

}
