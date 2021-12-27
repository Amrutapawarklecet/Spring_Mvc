package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mvc.beans.EmployeeBean;

@Controller
public class EmployeeController {
	@RequestMapping("/")
	public String showMyHomePage() {
		return "index";

	}

	@RequestMapping("showTheForm")
	public String showTheForm(Model model) {
		EmployeeBean employeeBean= new EmployeeBean();
		employeeBean.setFirstName("Amruta");
		employeeBean.setLastName("Pawar");
		model.addAttribute("employeeBean", employeeBean);
		return "empForm";

	}

	@RequestMapping("processFrom")
	public String processForm(@ModelAttribute("employeeBean") EmployeeBean employeeBean,Model model) {
		String fname=employeeBean.getFirstName();
		String lname=employeeBean.getLastName();
		String msg="Dear "+fname+" "+lname+"! Congratulation!, You are registed with us";
		model.addAttribute("msg", msg);
		return "empForm";
		
	}
}
