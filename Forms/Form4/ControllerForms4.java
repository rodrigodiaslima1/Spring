package com.tvc.springdemoMvc.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controllerForms4")
public class ControllerForms4 {
	
	@RequestMapping("/form4")
	public String showForm4View(Model model) {
		model.addAttribute("account1Model", new Account());
		
		return "form4";
	}
	
	@RequestMapping("/processForm4")
	public String processForm4View(
			@ModelAttribute("account1Model") Account account, Model model
			) {
		
		
		
		return "processForm4";
	}

}
