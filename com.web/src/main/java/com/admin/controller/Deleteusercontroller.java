package com.admin.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.model.Users;
import com.admin.service.Deleteuserservice;

@Controller
public class Deleteusercontroller {

	@Autowired
	private Deleteuserservice service;
	
	@RequestMapping(value="delit.do")
	public String deleteUserData(Model model,HttpServletRequest request)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		ArrayList<Users> list=null;
		list=(ArrayList<Users>) service.deleteuserserv(id);
		model.addAttribute("list", list);
		return "viewall";
	}
}
