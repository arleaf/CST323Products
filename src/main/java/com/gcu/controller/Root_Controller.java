package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Root_Controller {
	
	/**
	 * Root Controller that returns a view along with a Model Attribute
	 * @param model Model to bind to the view
	 * 
	 * @return View name home
	 */
    @GetMapping("")
    public String display(Model model) {
        model.addAttribute("title", "Home");
        return "home";
    }
}
