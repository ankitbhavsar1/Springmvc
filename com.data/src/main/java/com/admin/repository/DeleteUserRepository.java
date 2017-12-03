package com.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.admin.model.Users;

@Repository
public class DeleteUserRepository {

	@Autowired
	private HibernateTemplate template;

	public List<Users> deletuserrepo(int id) {
		Users user = new Users();
		user = template.load(Users.class, id);
		template.delete(user);
		ArrayList<Users> list = new ArrayList<Users>();
		list = (ArrayList<Users>) template.loadAll(Users.class);
		if (list == null) {
			return null;
		} else {
			return list;
		}
	}
}
