package com.example.springdocpolydemo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@PostMapping
	public BaseClass post(@RequestBody final BaseClass request) {
		// ...
		return null;
	}
}
