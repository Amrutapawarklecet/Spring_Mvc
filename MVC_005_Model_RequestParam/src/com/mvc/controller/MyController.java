package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	/*@RequestMapping("displayMyName")
	public String displayMyName(HttpServletRequest request ,Model model) {
		String name=request.getParameter("myname");
		String msg="Hi "+name+" Welcome to the spring world!";
		model.addAttribute("msg", msg);
		return "nameFrom";
	}
	*/
	
	@RequestMapping("displayMyName")
	public String displayMyName(@RequestParam("myname") String myname,Model model) {
		
		String msg="Hi "+myname+" Welcome to the spring world!";
		model.addAttribute("msg", msg);
		return "nameFrom";
	}
}
