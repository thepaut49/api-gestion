package com.thepolo49.apigestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApiGestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGestionApplication.class, args);
	}

}
