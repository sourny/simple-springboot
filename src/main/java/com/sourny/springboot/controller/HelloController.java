package com.sourny.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String sayHello() {
		System.out.println("say hello...");
		return "Hello World!";
	}
}
