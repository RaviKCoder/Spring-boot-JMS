package com.ravi.runners;




import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.ravi.model.Actor;

@Component
public class ReceiverApp  {

	@JmsListener(destination="testmq2")
	public void readMessage(Actor actor) {
		System.out.println("Recived Object message is: "+actor);
	}
	 
	

}
