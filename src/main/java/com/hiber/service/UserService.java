package com.hiber.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hiber.config.HiberConfig;
import com.hiber.models.Users;

public class UserService {
	
	
private SessionFactory  sf=null;
	
	public UserService()
	{
		sf = HiberConfig.getSessionFactory();
	}
	
	public void AddNewUser(Users user)
	{
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(user);
		trans.commit();
		session.close();
	}
	
	
	public Users  CheckUsers(String uname, String pwd)
	{
		Session session = sf.openSession();
		TypedQuery  qry  = session.createQuery("from Users where username=:uname and password=:pwd");
		qry.setParameter("uname", uname);
		qry.setParameter("pwd", pwd);
		List<Users>  uall = qry.getResultList();
		
		if(uall.isEmpty())
			return null;
		
		return uall.get(0);
	}
	

}
