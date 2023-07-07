package com.hiber.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classDetails")
public class ClassDetails {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
   
	
	
	@Column(name="cl_name")
	private String className;
	
	
	
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	

	
	
	
	

}
