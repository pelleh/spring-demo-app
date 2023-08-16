package com.knowit.gb.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String getContextRootMessage() {
		return "Application deployed to Openshift successfully!";
	}

	@GetMapping("/{name}")
	public String getGreetingMessage(@PathParam("name") String name) {
		return String.format("Hello %s!", name);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
