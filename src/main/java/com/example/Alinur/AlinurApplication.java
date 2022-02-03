package com.example.Alinur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlinurApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlinurApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "<h1>Hello Alinur</h1>";
	}

}
