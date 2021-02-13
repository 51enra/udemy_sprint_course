package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	// Alternative 3: populate country options from properties file
	@Value("#{myParameters}")
	private Map<String,String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a new student object & add to model
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		
		//For Alternative 3: add country options to the model
		theModel.addAttribute("myCountryOptions", countryOptions);
	
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// log the input data (from model attribute "student", which is
		// populated by the Spring container with data submitted by
		// student-form to that model attribute  
		System.out.println("theStudent: " + theStudent.getFirstName()
								+ " " + theStudent.getLastName()
								+ " from " + theStudent.getCountry()
								+ " and " + theStudent.getCountryAlt());
		
		return "student-confirmation";
	}
}
