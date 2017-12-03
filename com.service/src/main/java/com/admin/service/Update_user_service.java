package com.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.Users;
import com.admin.repository.Update_user_repository;

@Service
public class Update_user_service {

	@Autowired
	private Update_user_repository repository;

	public Users getuser_serv(int id) {
		Users user = new Users();
		user = repository.getUser(id);
		if (user == null) {
			return user;
		} else {
			return user;
		}
	}
	
	public List<Users> saveupdateuser_ser(Users users)
	{
		List<Users> list=null;
		list=repository.saveupdateuser_repo(users);
		if(list.size()==0)
		{
			return null;
		}
		else 
		{
			return list;
		}
	}
}