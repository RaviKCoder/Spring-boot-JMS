package com.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProj33SpbJmsProj3PublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj33SpbJmsProj3PublisherApplication.class, args);
	}

}
