package com.example.simplewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimpleWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebAppApplication.class, args);
	}

	@RestController
	class HelloWorldController {

		@GetMapping("/")
		public String welcome() {
			return "Welcome, you are looking at Amarender's test website !";
		}

		@GetMapping("/api/hello")
		public String hello() {
			return " {message: \"welcome\", author: \"Amarender Reddy Jakka\"}";
		}
	}

}
