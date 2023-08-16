package com.knowit.gb.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String getContextRootMessage() {
		return "Application deployed to Openshift successfully!";
	}

	@GetMapping("/{name}")
	@ResponseBody
	public String getGreetingMessage(@PathVariable String name) {
		return String.format("Hello %s!", name);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
