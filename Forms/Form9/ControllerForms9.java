package com.tvc.springdemoMvc.forms;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tvc.springdemoMvc.forms.classes.Customer;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/controllerForms9")
public class ControllerForms9 {
	
	@RequestMapping("/form9")
	public String showForm9View(Model model) {
		model.addAttribute("customerModel", new Customer());
		return "form9";
	}
	
	
	/*
	 * First I used the following code
	 * to get the parameters from user input
	 * in the jsp form:
	 * 
	 * HttpServletRequest request
	 */
	@RequestMapping("/processForm9")
	public String processForm9(
			@Valid @ModelAttribute("customerModel") Customer customer,
			BindingResult bindingResult
			) {
		
		if(bindingResult.hasErrors()) {
			return "form9";
		} else {
			return "processForm9";
		}
		
				/*
				 * String firstName = request.getParameter("userFirstName"); String lastName =
				 * request.getParameter("userLastName"); String fullName =
				 * firstName.toUpperCase() + " " + lastName.toUpperCase();
				 * 
				 * model.addAttribute("fullNameModel", fullName);
				 */
		
	}

}
