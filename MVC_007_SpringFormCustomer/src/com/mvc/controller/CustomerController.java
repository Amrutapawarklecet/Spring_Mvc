package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mvc.beans.CustomerBean;

@Controller
public class CustomerController {
	@RequestMapping("/")
	public String showMyHomePage() {
		return "index";

	}

	@RequestMapping("showTheForm")
	public String showTheForm(Model model) {
		CustomerBean customerBean = new CustomerBean();
		customerBean.setFirstName("Amruta");
		customerBean.setLastName("Pawar");
		model.addAttribute("customerBean", customerBean);
		return "customerForm";

	}

	@RequestMapping("processFrom")
	public String processForm(@ModelAttribute("customerBean") CustomerBean customerBean, Model model) {
		String fname = customerBean.getFirstName();
		String lname = customerBean.getLastName();
		String email = customerBean.getEmail();
		String mobilenumber = customerBean.getMobilenumber();
		String country = customerBean.getCountry();
		String favCuisine = customerBean.getFavCuisine();
		String assets[] = customerBean.getAssets();
		
		String str="";
		for(int i=0;i<assets.length;i++) {
			System.out.println(assets[i]);
			str=str+assets[i]+" ";
		}
		String msg = "Dear " + fname + " " + lname + " " + "! Congratulation!, You are registed with us"+
			" "	+"your are form: " +" "+ country + "Your favorite dish : " + favCuisine +" "+"your assets are:"+str;
		model.addAttribute("msg", msg);
		return "customerForm";

	}
}
