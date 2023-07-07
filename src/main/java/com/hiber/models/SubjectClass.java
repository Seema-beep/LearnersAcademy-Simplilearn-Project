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
public class SubjectClass {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SerialNumber")
    private int serialNumber;

    @ManyToOne
    @JoinColumn(name = "SubjectID", referencedColumnName = "subject_id")
    private int su_id;
   

    @ManyToOne
    @JoinColumn(name = "ClassID", referencedColumnName = "cl_id")
    private int cid;

	public SubjectClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
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

	

	
	
	
	
	

}
