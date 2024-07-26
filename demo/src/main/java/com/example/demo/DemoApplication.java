package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//  .run is a class with extends by ApplicationContext which is the name of IOC obj.
		//  In that we are creating the object of greet() which will be managed by SpringBoot.
		//  @Component will tell the spring to create object in IOC container
		ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		Dev obj= context.getBean(Dev.class);
		obj.build();



	}

}
