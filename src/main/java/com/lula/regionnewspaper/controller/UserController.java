package com.lula.regionnewspaper.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lula.regionnewspaper.model.Advertisement;
import com.lula.regionnewspaper.model.User;
import com.lula.regionnewspaper.service.UserService;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("usrSession")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/register.html")
	public String addUserView(Map<String, Object> map)
	{
		map.put("user", new User());
		return "register";
	}
	
	@RequestMapping(value = "/register.html", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user, BindingResult result) 
	{
	        userService.addUser(user);	 
	        return "redirect:/category.html";
	}
	
	@RequestMapping(value = "/login.html")
	public String loginView(Map<String, Object> map)
	{
		map.put("user", new User());
		return "login";
	}
	
	
	@RequestMapping(value = "/login.html", method = RequestMethod.POST)  
    public ModelAndView login(@ModelAttribute User user) 
	{  
        ModelAndView modelAndView = new ModelAndView();         
        User userSearch=userSearch=userService.getUserByLogin(user.getLogin());
		
		if(userSearch!=null && user.getLogin().equals(userSearch.getLogin()) && user.getPassword().equals(userSearch.getPassword()))
		{
			modelAndView.addObject("usrSession", userSearch.getFirstName());
			modelAndView.setViewName("redirect:/category.html");
			return modelAndView; 
		}
		else
		{	 
			user.setLogin("INVALID LOGIN OR PASSWORD");
			user.setPassword(null);
			return modelAndView;
	    }
    }  
	
	@RequestMapping(value = "/logout.html")
	public ModelAndView logout(@ModelAttribute User user) 
	{ 
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("usrSession", "");
		 modelAndView.setViewName("redirect:/category.html");
		 return modelAndView;
	}
	
}
