package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String login() {
		return "login";
	}

	@GetMapping("/login")
	public String redirectLogin() {
		return "login";
	}

	@GetMapping("Contacts")
	public String Contacts() {
		return "Contacts";
	}

}
