package com.hiber.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hiber.config.HiberConfig;


import com.hiber.models.Teacher;

public class TeacherService {
	
private SessionFactory  sf = null;
	
	public TeacherService()
	{
		sf = HiberConfig.getSessionFactory();
	}
	
	
	//Adding a new teacher
	public void AddNewTeacher(Teacher th)
	{
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(th);
		trans.commit();
		session.close();
	}
	
	
	public List<Teacher> ShowAllTeacher()
	{
		Session session = sf.openSession();
		TypedQuery qry =  session.createQuery("from Teacher");
		List<Teacher>  th = qry.getResultList();
		return  th;
	}
	
	
	public Teacher SearchTeacher(int tno)
	{
		Session session = sf.openSession();
	    TypedQuery qry = session.createQuery("from Teacher where tid=:teacherid");
	    qry.setParameter("teacherid", tno);
	    List<Teacher> tall = qry.getResultList();
	    if(tall.isEmpty())
	    	return null;
	    
	    return tall.get(0);
	    
	    
	}
	
	
	
	public String UpdateTeacher(Teacher th)
	{
		String res = "err";
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		TypedQuery qry = session.createQuery("Update Teacher set name=:tname, qualification=:qf, specialization=:sz ,dateOfJoining=:dj,designation=:dg,address=:ad,phoneNumber=:pN,email=:em where tid=:teacherid");
	    qry.setParameter("teacherid", th.getTid());
	    qry.setParameter("tname", th.getName());
	    qry.setParameter("qf", th.getQualification());
	    qry.setParameter("sz", th.getSpecialization());
	    qry.setParameter("dj", th.getDateOfJoining());
	    qry.setParameter("dg", th.getDesignation());
	    qry.setParameter("ad", th.getAddress());
	    qry.setParameter("pN", th.getPhoneNumber());
	    qry.setParameter("em", th.getEmail());
	    int r1 = qry.executeUpdate();
	    trans.commit();
	    if(r1>=1)
	    	res="Success";
	    
	    return res;
	}
	
	
	public String DeleteTeacher(int tno)
	{
		
		String res = "err";
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		TypedQuery qry = session.createQuery("Delete from Teacher where tid=:teacherid");
	    qry.setParameter("teacherid", tno);
	    int r1 = qry.executeUpdate();
	    trans.commit();
	    if(r1>=1)
	    	res="Success";
	    
	    return res;
	}
	

}
