package com.javainuse.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.model.Users;


@Controller
public class IndexController {
	/*@RequestMapping("index")
	public String index() {
		//System.out.println("Hi");
		return "index";
		
	}*/
	/*@RequestMapping("index")
	public String index(HttpServletRequest req) {
		//System.out.println("Hi");
		HttpSession session =req.getSession();
		String name =req.getParameter("name");
		session.setAttribute("username", name);
		return "index";
		
	}*/
	
	/*@RequestMapping("index")
	public String index(@RequestParam("name") String name ,HttpSession session) {
		//System.out.println("Hi");
		session.setAttribute("username", name);
		return "index";
		
	}*/
	/*@RequestMapping("index")
	public ModelAndView index(@RequestParam("name") String myName ) {
		//System.out.println("Hi");
		ModelAndView mv = new ModelAndView();
		mv.addObject("username",myName);
		mv.setViewName("index");
		return mv;
		
	}*/
	@RequestMapping("/")
	public ModelAndView index() {
		//System.out.println("Hi");
		ModelAndView mv = new ModelAndView();
		//mv.addObject("objUser",user);
		mv.setViewName("index");
		return mv;
		
	}
}
