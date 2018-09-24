package com.sn.onlinerestaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MasterPageController {
	
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView home() {
		ModelAndView modelAndView= new ModelAndView("masterPage");
		modelAndView.addObject("message","Hello from Spring MVC");
		return modelAndView;
	}

}
