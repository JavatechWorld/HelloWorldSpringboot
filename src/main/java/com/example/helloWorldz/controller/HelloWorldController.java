package com.example.helloWorldz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String sayhello() {
		return "Hello World ! How are you doing ?";
	}
}
