package com.admin.controller;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.admin.model.Users;
import com.admin.service.Adduser_service;

@Controller
public class Adduser_controller {

	@Autowired
	private Adduser_service service;

	@RequestMapping(value = "viewuser.do")
	public String view_user(Model model) {
		System.out.println("controller");
		Users users = new Users();
		model.addAttribute("Users", users);
		return "Viewuser";
	}

	/*@RequestMapping(value = "submituser.do", method = RequestMethod.POST)
	public String adduser(Users Users, Model model) {
		List<Users> list = new ArrayList<Users>();
		list = null;
		list = service.adduser_serv(Users);
		model.addAttribute("list", list);
		System.out.println(Users.getName());
		return "viewall";
	}*/
	
	@RequestMapping(value = "submituser.do", method = RequestMethod.GET)
	public String adduserr(Users Users, Model model) {
		List<Users> list = new ArrayList<Users>();
		list = null;
		list = service.adduser_serv(Users);
		model.addAttribute("list", list);
		System.out.println(Users.getName());
		return "viewall";
	}
}