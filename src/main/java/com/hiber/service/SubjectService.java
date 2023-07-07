package com.hiber.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hiber.config.HiberConfig;
import com.hiber.models.ClassDetails;
import com.hiber.models.SubjectEntity;

public class SubjectService {
	
	
private SessionFactory  sf = null;
	
	public  SubjectService() {
		
	
		sf = HiberConfig.getSessionFactory();
	}
	
	
	//Adding a new teacher
	public void AddNewSubject(SubjectEntity se)
	{
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(se);
		trans.commit();
		session.close();
	}
	//List out the Subjects
	public List<SubjectEntity> ShowAllSubjects()
	{
		Session session = sf.openSession();
		TypedQuery qry =  session.createQuery("from SubjectEntity");
		List<SubjectEntity>  se = qry.getResultList();
		return  se;
	}
	
	
	public SubjectEntity SearchSubject(int subno)
	{
		Session session = sf.openSession();
	    TypedQuery qry = session.createQuery("from SubjectEntity where su_id=:subjid");
	    qry.setParameter("subjid", subno);
	    List<SubjectEntity> se = qry.getResultList();
	    if(se.isEmpty())
	    	return null;
	    
	    return se.get(0);
	}
	

	public String DeleteSubject(int subno)
	{
		
		String res = "err";
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		TypedQuery qry = session.createQuery("Delete from SubjectEntity where su_id=:subjid");
	    qry.setParameter("subjid", subno);
	    int r1 = qry.executeUpdate();
	    trans.commit();
	    if(r1>=1)
	    	res="Success";
	    
	    return res;
	}
	
	
	public List<SubjectEntity> ShowAllSubsBasedOnClass(int sno)
	{
		Session session = sf.openSession();
		TypedQuery qry =  session.createQuery("from SubjectEntity where su_id=:sno");
		qry.setParameter("sno",sno);
		List<SubjectEntity>  sub_all = qry.getResultList();
		return  sub_all;
	}
	

}
