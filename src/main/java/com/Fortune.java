package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {
	@RequestMapping("/fortune")
	public String start() {
		return "temp.html";
	}
}
