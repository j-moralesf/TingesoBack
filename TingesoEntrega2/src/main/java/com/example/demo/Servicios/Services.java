package com.example.demo.Servicios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Services {

	@GetMapping("/hello")
	public String HelloWorld(){
    	return "Hello World";
	}
}
