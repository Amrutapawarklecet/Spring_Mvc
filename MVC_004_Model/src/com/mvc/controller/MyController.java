package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String displayMyName(HttpServletRequest request ,Model model) {
		String name=request.getParameter("myname");
		String msg="Hi "+name+" Welcome to the spring world!";
		model.addAttribute("msg", msg);
		return "nameFrom";
	}
}
