package com.tvc.springdemoMvc.forms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controllerForms1")
public class ControllerForms1 {
	
	@RequestMapping("/form1")
	public String showForm1View() {
		return "form1";
	}
	
	@RequestMapping("/processForm1")
	public String processForm1View() {
		return "processForm1";
	}

}
