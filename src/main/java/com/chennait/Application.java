package com.chennait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
ptivate static final String REST_URL="https://equifax.com/getScores";
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		//changes for HIS-134
		
		//HIS-200 related changes
		public void doProcess(){
			//logic goes here
		}
		run.close();
	}

}
