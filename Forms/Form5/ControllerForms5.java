package com.tvc.springdemoMvc.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controllerForms5")
public class ControllerForms5 {
	
	@RequestMapping("/form5")
	public String showForm5View(Model model) {
		model.addAttribute("person1Model", new Person());
		
		return "form5";
	}
	
	@RequestMapping("/processForm5")
	public String processForm5View(@ModelAttribute("person1Model") Person person) {
		
		return "processForm5";
	}

}
