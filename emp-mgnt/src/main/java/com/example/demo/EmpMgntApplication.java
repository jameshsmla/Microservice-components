package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class EmpMgntApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMgntApplication.class, args);
	}

}


@RestController
@RefreshScope
@RequestMapping
class Emp{
	
	
	@Value("${msg}")
	private String mess;
	
	@GetMapping("/itvalue")
	public String value() {
		return mess;
	}
	
	
}