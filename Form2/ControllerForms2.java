package com.tvc.springdemoMvc.forms;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controllerForms2")
public class ControllerForms2 {
	
	@RequestMapping("form2")
	public String showForm2View() {
		return "form2";
	}
	
	@RequestMapping("/processForm2")
	public String processForm2View(
			HttpServletRequest request, Model model
			) {
		
		String name = request.getParameter("yourName");
		String email = request.getParameter("yourEmail");
		String password = request.getParameter("yourPassword");
		
		String nameConfirmed = name.toUpperCase();
		String emailConfirmed = email.toUpperCase();
		String passwordConfirmed = password.toUpperCase();
		
		/*
		 * String confirmation = String.format(
		 * "User: %s\nEmail: %s\nPassword: %s\nCONFIRMED!", name, email, password);
		 */
		
		model.addAttribute("nameModel", nameConfirmed);
		model.addAttribute("emailModel", emailConfirmed);
		model.addAttribute("passwordModel", passwordConfirmed);
		
		return "processForm2";
	}

}
