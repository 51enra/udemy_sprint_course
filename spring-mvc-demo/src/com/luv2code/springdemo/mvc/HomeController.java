package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
		// Dies gibt die Datei an, die an den web request zurückgegeben wird.
		// In spring-mvc-demo-servlet.xml, Step 5 wird festgelegt dass die
		// komplette Bezeichnung WEB-INF/view/main-menu.jsp ist.
	}
}
