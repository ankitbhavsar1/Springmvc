package com.admin.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.admin.model.Users;
import com.admin.service.Update_user_service;

@Controller
public class Update_user_controller {

	@Autowired
	private Update_user_service service;
	
	@RequestMapping(value="edit.do", method=RequestMethod.GET)
	public String getuserid(Model model, HttpServletRequest request)
	{
		System.out.println("uddet get");
		int id=Integer.parseInt(request.getParameter("id"));
		model.addAttribute("Users", new Users());
		Users list=service.getuser_serv(id);
		System.out.println("id="+list.getId());
		model.addAttribute("list", list);
		return "updateuser";
	} 
	
	@RequestMapping(value="updateuser.do" ,method=RequestMethod.POST)
	public String saveupdateuser(@ModelAttribute("Users") Users users , Model model )
	{
		List<Users> list=new ArrayList<Users>();
		list=service.saveupdateuser_ser(users);
		if(list==null)
		{
			model.addAttribute("Null", null);
			return "Viewuser";
		}
		else
		{
			model.addAttribute("list", list);
			return "viewall";
		}
		
	}
	
}
