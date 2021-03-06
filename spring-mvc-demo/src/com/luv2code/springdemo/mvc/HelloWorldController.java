package com.luv2code.springdemo.mvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") //parent for following @RequestMappings
public class HelloWorldController {

	//controller method to show the HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//controller method to read form data and add data to the model
	@RequestMapping("/processFormTwo")	
	public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {
		
		// convert data to all caps and	
		// create the message
		String result = "HoHo! " + theName.toUpperCase();
		
		// add the message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
