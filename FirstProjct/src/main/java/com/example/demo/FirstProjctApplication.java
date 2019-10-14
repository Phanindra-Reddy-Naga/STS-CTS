package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjctApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FirstProjctApplication.class, args);
		//System.out.println("Welcome to Boot......");
		
		Alien a=context.getBean(Alien.class);
		a.show();
		
	}

}
