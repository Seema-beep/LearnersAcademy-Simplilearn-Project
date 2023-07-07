package com.hiber.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class SubjectAllocation {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allot_id")
    private int allotId;

    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "subject_id")
     private int su_id;

    @ManyToOne
    @JoinColumn(name = "class_id", referencedColumnName = "cl_id")
    private int cid;

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "t_id")
    private int tid;
    
    
    

	public SubjectAllocation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAllotId() {
		return allotId;
	}

	public void setAllotId(int allotId) {
		this.allotId = allotId;
	}

	
	public int getSu_id() {
		return su_id;
	}

	public void setSu_id(int su_id) {
		this.su_id = su_id;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	
	
	
    
    
    
    

    
}






	
	


