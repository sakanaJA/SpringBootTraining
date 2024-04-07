package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register {
	
	@RequestMapping("/")
	public String start() {
		return "input.html";
	}
	
	@RequestMapping("/register")
	public String starts() {
		return "temp.html";
	}
	
}
