package com.tvc.springdemoMvc.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tvc.springdemoMvc.forms.classes.Customer2;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/controllerForms10")
public class ControllerForms10 {
	
	@RequestMapping("/form10")
	public String showForm10View(Model model) {
		model.addAttribute("customer2Model", new Customer2());
		
		return "form10";
	}
	
	
	@RequestMapping("/processForm10")
	public String processForm10(
			@Valid @ModelAttribute("customer2Model")Customer2 customer,
			BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "form10";
		}else {
			return "processForm10";
		}
		
	}

}
