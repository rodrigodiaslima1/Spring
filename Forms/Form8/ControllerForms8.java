package com.tvc.springdemoMvc.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tvc.springdemoMvc.forms.classes.Candidate;

@Controller
@RequestMapping("/controllerForms8")
public class ControllerForms8 {

	@RequestMapping("/form8")
	public String showForm8View(Model model) {
		model.addAttribute("candidate2Model", new Candidate());
		
		return "form8";
	}
	
	@RequestMapping("/processForm8")
	public String processForm8View(
			@ModelAttribute("candidate2Model")Candidate candidate) {
		
		return "processForm8";
	}
	
}
