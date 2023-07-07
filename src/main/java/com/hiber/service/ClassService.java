package com.hiber.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hiber.config.HiberConfig;

import com.hiber.models.ClassDetails;




public class ClassService {
	
private SessionFactory  sf = null;
	
	public ClassService() {
		sf = HiberConfig.getSessionFactory();
	}
	
	
	//Adding a new teacher
	public void AddNewClass(ClassDetails cl)
	{
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(cl);
		trans.commit();
		session.close();
	}
	
	
	public List<ClassDetails> ShowAllClasses()
	{
		Session session = sf.openSession();
		TypedQuery qry =  session.createQuery("from ClassDetails");
		List<ClassDetails>  call = qry.getResultList();
		return  call;
	}
	
	
	public ClassDetails SearchClass(int cno)
	{
		Session session = sf.openSession();
	    TypedQuery qry = session.createQuery("from ClassDetails where cid=:classid");
	    qry.setParameter("classid", cno);
	    List<ClassDetails> call = qry.getResultList();
	    if(call.isEmpty())
	    	return null;
	    
	    return call.get(0);
	}
	
	
	public String DeleteClass(int cno)
	{
		
		String res = "err";
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		TypedQuery qry = session.createQuery("Delete from ClassDetails where cid=:classid");
	    qry.setParameter("classid", cno);
	    int r1 = qry.executeUpdate();
	    trans.commit();
	    if(r1>=1)
	    	res="Success";
	    
	    return res;
	}
	

}
