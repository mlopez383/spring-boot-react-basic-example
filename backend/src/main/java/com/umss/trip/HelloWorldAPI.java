package com.umss.trip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldAPI {
	@GetMapping("/hello")
	public String hello() {
		return "Hello World from the Server";
	}
}