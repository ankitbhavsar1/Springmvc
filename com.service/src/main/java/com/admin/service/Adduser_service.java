package com.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.Users;
import com.admin.repository.Adduser_repository;

@Service
public class Adduser_service {

	@Autowired
	private Adduser_repository repository;

	public List<Users> adduser_serv(Users users) {
		List list = new ArrayList();
		list = repository.adduser_repo(users);
		System.out.println("service=" + users.getName());
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}
}
