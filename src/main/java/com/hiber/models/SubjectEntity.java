package com.hiber.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class SubjectEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int su_id;
   

    @Column(name = "subject_name")
    private String name;
    
    

	public SubjectEntity() {
		super();
		
	}

	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getSu_id() {
		return su_id;
	}



	public void setSu_id(int su_id) {
		this.su_id = su_id;
	}
	
	
	
	
	
    
    
	
	
	

}
