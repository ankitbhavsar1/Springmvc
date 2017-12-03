package com.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.admin.model.Users;

@Repository
public class Adduser_repository {

	@Autowired
	private HibernateTemplate template;

	public List<Users> adduser_repo(Users users) {
		ArrayList list = new ArrayList();
		list = null;
		template.save(users);
		list = (ArrayList) template.loadAll(Users.class);
		if (list == null) {
			return null;
		} else {
			return list;
		}
	}
}
