package com.tvc.springdemoMvc.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controllerForms3")
public class ControllerForms3 {
	
	@RequestMapping("/form3")
	public String showForms3View() {
		return "form3";
	}
	
	@RequestMapping("/processForm3")
	public String processForm3View(
			@RequestParam("yourName") String name,
			@RequestParam("yourEmail") String email,
			@RequestParam("yourPassword") String password,
			Model model
			) {
		
		
		String nameConfirmed = name.toUpperCase();
		String emailConfirmed = email.toUpperCase();
		String passwordConfirmed = password.toUpperCase();
		
		model.addAttribute("nameModel", nameConfirmed);
		model.addAttribute("emailModel", emailConfirmed);
		model.addAttribute("passwordModel", passwordConfirmed);
		
		
		return "processForm3";
	}

}
