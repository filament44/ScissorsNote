package com.scissorsNote.app.sales;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sales")
public class SalesController {
	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("title", "Sales Form");
		return "sales/form";
	}
	
	@PostMapping("/confirm")
	public String confirm(SalesForm salesForm, Model model) {
		model.addAttribute("title", "Confirm Page");
		return "sales/confirm";
	}

}
