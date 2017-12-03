package com.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.admin.model.Users;

@Repository
public class Update_user_repository {

	@Autowired
	private HibernateTemplate template;
	
	public Users getUser(int id)
	{
		Users list=new Users();
		list=null;
		list=template.get(Users.class, id);
		if(list==null){
		return null;
		}
		else {
			return list;
		}
	}
	
	public List<Users> saveupdateuser_repo(Users users)
	{
		ArrayList<Users> list=new ArrayList<Users>();
		template.saveOrUpdate(users);
		list=(ArrayList<Users>) template.loadAll(Users.class);
		if(list==null)
		{
			return list;
		}
		else
		{
			return list;
		}
	}
}
