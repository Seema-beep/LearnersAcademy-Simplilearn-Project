package com.hiber.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hiber.config.HiberConfig;
import com.hiber.models.Student;
import com.hiber.models.Teacher;


public class StudentService {
	
private SessionFactory  sf = null;
	
	public StudentService() {
		sf = HiberConfig.getSessionFactory();
	}
	
	//Adding a new teacher
	public void AddNewStudent(Student s)
	{
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(s);
		trans.commit();
		session.close();
	}

	
	public List<Student> ShowAllStudent()
	{
		Session session = sf.openSession();
		TypedQuery qry =  session.createQuery("from Student");
		List<Student>  st = qry.getResultList();
		return  st;
	}
	
	
	public Student SearchStudent(int sno)
	{
		Session session = sf.openSession();
	    TypedQuery qry = session.createQuery("from Student where sid=:studentid");
	    qry.setParameter("studentid", sno);
	    List<Student> sall = qry.getResultList();
	    if(sall.isEmpty())
	    	return null;
	    
	    return sall.get(0);
	    
	    
	}
	
	
	public String UpdateStudent(Student s)
	{
		String res = "err";
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		TypedQuery qry = session.createQuery("Update Student set name=:sname, gender=:gd, fatherName=:fN ,motherName=:mN,address=:ad,phoneNumber=:pN,emailId=:em where sid=:stuid");
	    qry.setParameter("stuid", s.getSid());
	    qry.setParameter("sname", s.getName());
	    qry.setParameter("gd", s.getGender());
	    qry.setParameter("fN", s.getFatherName());
	    qry.setParameter("mN", s.getMotherName());
	    qry.setParameter("ad", s.getAddress());
	   
	    qry.setParameter("pN", s.getPhoneNumber());
	    qry.setParameter("em", s.getEmailId());
	    int r1 = qry.executeUpdate();
	    trans.commit();
	    if(r1>=1)
	    	res="Success";
	    
	    return res;
	}
	
	
	public String DeleteStudent(int sno)
	{
		
		String res = "err";
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		TypedQuery qry = session.createQuery("Delete from Student where sid=:studentid");
	    qry.setParameter("teacherid", sno);
	    int r1 = qry.executeUpdate();
	    trans.commit();
	    if(r1>=1)
	    	res="Success";
	    
	    return res;
	}
	
}
