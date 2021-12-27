package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String showMyHomePage() {
		return "index";
		
	}
	
	@RequestMapping("showTheNameForm")
	public String showTheName() {
		return "nameFrom";
		
	}
	
	@RequestMapping("displayMyName")
	public String displayMyName() {
		return "displayName";
	}
}
