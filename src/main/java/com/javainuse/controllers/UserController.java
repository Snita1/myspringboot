package com.javainuse.controllers;

import java.util.List;

import javax.ws.rs.POST;


import java.util.logging.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.Repo.UserRepo;
import com.javainuse.model.Items;
import com.javainuse.model.Users;
import com.javainuse.services.UserService;


@Controller
public class UserController {
	
	private final static Logger LOGGER = Logger.getLogger(UserController.class.getName());
	@Autowired
	UserService userService;
	
	/*@RequestMapping(value = "/")
	public ModelAndView home() {
		ModelAndView mv =new ModelAndView();
		//mv.addObject("Objuser",user);
		mv.setViewName("home");
		return mv;
		
	}*/
	@RequestMapping(value = "/Users")
	//@ResponseBody
		public ModelAndView getUsers() {
			ModelAndView mv=new ModelAndView();
			List<Users> listUsers=userService.getAllUsers();
			mv.addObject("Userslist",listUsers);
			mv.setViewName("users");
			return mv;

		}
		/*public List<Users> getUsers() {
		
		return userService.getAllUsers();
		
	}*/
	@RequestMapping(value = "/Users/Add")
	@ResponseBody

	public Users addItems(Users user) {

		return userService.saveUser(user);

	}

	
	@RequestMapping(value = "/Users/{userid}")
	@ResponseBody
	public String getUserById(@PathVariable int userid) {
		
		return userService.findById(userid).toString();
		
	}
	
	@RequestMapping(value = "/Users/Delete/{userid}")
	@ResponseBody
	public List<Users> deleteUserById(@PathVariable int userid) {
		
		userService.delete(userid);
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/Users/Update/{userid}")
	@ResponseBody
	public List<Users> updateUserById(@PathVariable int userid) {
		
		Users u=userService.findById(userid);
		u.setName("New Name 1");
		u.setDept("Tech");
		userService.saveUser(u);
		return userService.getAllUsers();
	}
	
	@RequestMapping(value = "/addUser")
	public ModelAndView home(Users user) {
		ModelAndView mv =new ModelAndView();
		mv.addObject("Objuser",user);
		mv.setViewName("home");
		userService.saveUser(user);
		return mv;
		
	}
	
	@RequestMapping(value = "/getUser")
	public ModelAndView getUser(@RequestParam("id") int userid) {
		ModelAndView mv =new ModelAndView();
		Users user=userService.findById(userid);
		mv.setViewName("ShowUsers");
		mv.addObject("users",user);
		return mv;
		
	}
	
	
	
	@DeleteMapping(value = "/deleteUser/{id}")
	public ModelAndView deleteUser(@PathVariable int id) {
		ModelAndView mv =new ModelAndView();
		userService.delete(id);
		mv.setViewName("ShowUsers");
		mv.addObject("users",userService.getAllUsers());
		return mv;
		
	}
	
	@RequestMapping(value = "/updateUser")
	public ModelAndView updateUser(@RequestParam("id") int userid) {
		ModelAndView mv =new ModelAndView();
		Users user = userService.findById(userid);
		user.setName("New Name 1");
		user.setDept("Tech");
		userService.saveUser(user);
		mv.setViewName("ShowUsers");
		mv.addObject("users",userService.getAllUsers());
		return mv;
		
	}
	
	
	@RequestMapping(value = "/fetchAllUser",produces="application/json")
	@ResponseBody
	public ModelAndView fetchAllUser() {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("ShowUsers");
		mv.addObject("users",userService.getAllUsers());
		return mv;
		
	}
	/*@RequestMapping(value = "/")
	public String home() {
		return "home";
	}*/
	
	
	/*private final UserService userservice;

	@Autowired
	public UserController(UserService userservice) {
	
		this.userservice = userservice;
	}
	@PostMapping(value = "/addUser")
	public void addUserToList(@RequestBody Users user) {
		userservice.addUser(user);
	}
	
	
	@GetMapping
	public List<Users> getUsers() {
		for (Users u:userservice.getUsers()) {
		System.out.println(u);
		}
		return userservice.getUsers();
	}
	*/

}
