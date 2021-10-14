package com.healtheme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping
	public String welcome() {
		return "Say Hello to Health-e-Me Again";
	}
}