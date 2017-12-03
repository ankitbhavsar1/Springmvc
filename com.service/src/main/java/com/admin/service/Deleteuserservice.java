package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.Users;
import com.admin.repository.DeleteUserRepository;

@Service
public class Deleteuserservice {

	@Autowired
	private DeleteUserRepository repository;

	public List<Users> deleteuserserv(int id) {
		List<Users> list = null;
		list = repository.deletuserrepo(id);
		return list;
	}
}
