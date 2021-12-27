package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {

	//@ResponseBody
	//this can be access using view
	@RequestMapping("/cricketbat")
	public String giveCricketBat() {
		//return "hey...this is your cricket bat.";
		return "MRFCricketbat";
	}
}
