package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.impl.DefaultAddition;

@SpringBootApplication
public class Sonatatraining2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sonatatraining2Application.class, args);
		AddInterface1 addition = new DefaultAddition();
		System.out.println(addition.add(10, 20));
		
	}

}
