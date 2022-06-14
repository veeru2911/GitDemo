package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoAppApplication {

	public static void main(String[] args) {
		System.out.println("This is my first commit");
		SpringApplication.run(GitDemoAppApplication.class, args);
		
	}

}
