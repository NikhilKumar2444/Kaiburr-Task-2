package com.kaliburr.crud;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
@OpenAPIDefinition(info=@Info(title = "Kaiburr Task 2- Nikhil Kumar",description = "Student information API"))
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
	@GetMapping("/")
	public String apiRoot() {
		return "Hello Nik";
	}
	

}
