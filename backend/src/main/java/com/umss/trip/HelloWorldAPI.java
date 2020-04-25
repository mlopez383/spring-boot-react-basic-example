package com.umss.trip;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HelloWorldAPI {
	@GetMapping("/hello")
	public List<String> hello() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello World from the Server UMSS people");
		return list;
	}
}