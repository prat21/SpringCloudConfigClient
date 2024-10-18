package com.spring.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Value("${user.role:default role value---}")
	String role;
	
	@GetMapping("/test")
	public String test(){
		return "user.role: "+role;
	}
}
