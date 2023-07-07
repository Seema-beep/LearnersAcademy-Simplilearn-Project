package com.hiber.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hiber.models.ClassDetails;
import com.hiber.models.Student;
import com.hiber.models.SubjectEntity;
import com.hiber.models.Teacher;
import com.hiber.models.Users;





public class HiberConfig {
	
	
private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try
			{
				Configuration  cfg = new Configuration();
				Properties settings = new Properties();
				
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/schoolmanagement?useSSL=false");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "root");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				
				cfg.setProperties(settings);
				//settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				cfg.addAnnotatedClass(ClassDetails.class);
				cfg.addAnnotatedClass(Student.class);
				cfg.addAnnotatedClass(Users.class);
				//cfg.addAnnotatedClass(SubjectAllocation.class);
				//cfg.addAnnotatedClass(SubjectClass.class);
				cfg.addAnnotatedClass(SubjectEntity.class);
				cfg.addAnnotatedClass(Teacher.class);
				
				
				

				
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(cfg.getProperties()).build();
				
				System.out.println("Hibernate Java Config serviceRegistry created");
				sessionFactory = (SessionFactory) cfg.buildSessionFactory(serviceRegistry);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return sessionFactory;
	}

	}


