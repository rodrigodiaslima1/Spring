package com.tvc.springdemoMvc.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tvc.springdemoMvc.forms.classes.Candidate;

@Controller
@RequestMapping("/controllerForms7")
public class ControllerForms7 {
	
	@RequestMapping("/form7")
	public String showForm7View(Model model) {
		model.addAttribute("candidate1Model", new Candidate());
		
		return "form7";
	}
	
	@RequestMapping("/processForm7")
	public String processForm7View(
			@ModelAttribute("candidate1Model") Candidate candidate
			) {
		
		return "processForm7";
	}

}
