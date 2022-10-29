package com.tvc.springdemoMvc.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controllerForms6")
public class ControllerForms6 {
	
	@RequestMapping("/form6")
	public String showForm6View(Model model) {
		model.addAttribute("user1Model", new User());
		
		return "form6";
	}
	
	@RequestMapping("/processForm6")
	public String processForm6View(@ModelAttribute("user1Model")User user) {
		
		return "processForm6";
	}

}
