package com.scissorsNote.app.sales;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/sales")
public class SalesController {
	
	@GetMapping("/form")
	public String form(SalesForm salesForm, Model model) {
		model.addAttribute("title", "Sales Form");
		return "sales/form";
	}
	
	@PostMapping("/form")
	public String formGoBack(SalesForm salesForm, Model model) {
		model.addAttribute("title", "Sales Form");
		return "sales/form";
	}
	
	@PostMapping("/confirm")
	public String confirm(@Validated SalesForm salesForm,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			model.addAttribute("title", "Sales Form");
			return "sales/form";
		}
		
		model.addAttribute("title", "Confirm Page");
		return "sales/confirm";
	}
	
	@PostMapping("/complete")
	public String complete(SalesForm salesform, Model model, RedirectAttributes redirectAttribute) {
		redirectAttribute.addFlashAttribute("complete", "Completed!");
		return "redirect:/sales/form";
	}

}
