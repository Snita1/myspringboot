package com.javainuse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SetupController {
	
	@RequestMapping("/Setup")
	public ModelAndView setup() {
		//System.out.println("Hi");
		ModelAndView mv = new ModelAndView();
		//mv.addObject("objUser",user);
		mv.setViewName("setup");
		return mv;
		
	}

}
