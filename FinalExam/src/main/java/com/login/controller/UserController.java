package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.login.model.UserEntity;
import com.login.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping("/home")
	public ModelAndView getName() {
		ModelAndView mv = new ModelAndView("home"); // This is "HomePage: Success"
		return mv;
	}
	
	@RequestMapping(value = "adduser")
	public ModelAndView addUser() {
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("user", new UserEntity());
		return mv;
	}
	
	@RequestMapping(value = "saveuser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") UserEntity user) {
		if (service.addUser(user))
			return "redirect:/users/home"; // send to "HomePage: Success"
		else {
			return "ErrorPage";
		}
	}
	
	@RequestMapping(value = "loginuser", method = RequestMethod.POST)
	public String loginUser(@ModelAttribute("user") UserEntity user) {
		if (service.loginUser(user))
			return "redirect:/users/home"; // send to "HomePage: Success"
		else {
			return "ErrorPage";
		}
	}
}