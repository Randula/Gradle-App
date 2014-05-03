package com.expr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
	public String initialize(Model model) {
		model.addAttribute("name", "GradleApp");
		return "home";
	}
}
