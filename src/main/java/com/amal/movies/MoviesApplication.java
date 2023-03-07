package com.amal.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/root")
	public String apiRoot() {
		return "Hello World!";
	}

}

// 1. API Layer : Movie Controller
// 2. Business Logic Layer : Service Class
// 3. Repository Layer : communicate with database
