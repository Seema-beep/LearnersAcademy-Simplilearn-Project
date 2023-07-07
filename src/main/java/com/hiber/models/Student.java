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
@Table(name = "student")
public class Student {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int sid;
	   
	   

		@Column(name = "student_name")
	    private String name;

	    @Column(name = "gender")
	    private String gender;

	    @Column(name = "father_name")
	    private String fatherName;

	    @Column(name = "mother_name")
	    private String motherName;

	    @Column(name = "address")
	    private String address;

	    @Column(name = "phone_number")
	    private String phoneNumber;

	    @Column(name = "email_id")
	    private String emailId;
	    
	    @ManyToOne
	    @JoinColumn(name = "cid")
	    private ClassDetails studentClass;
	    
	  

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		

		public Student(int sid, String name, String gender, String fatherName, String motherName, String address,
				String phoneNumber, String emailId, ClassDetails studentClass) {
			super();
			this.sid = sid;
			this.name = name;
			this.gender = gender;
			this.fatherName = fatherName;
			this.motherName = motherName;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.emailId = emailId;
			this.studentClass = studentClass;
		}




		public ClassDetails getStudentClass() {
			return studentClass;
		}




		public void setStudentClass(ClassDetails studentClass) {
			this.studentClass = studentClass;
		}




		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getFatherName() {
			return fatherName;
		}

		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}

		public String getMotherName() {
			return motherName;
		}

		public void setMotherName(String motherName) {
			this.motherName = motherName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
	    
		

	    public int getSid() {
			return sid;
		}



		public void setSid(int sid) {
			this.sid = sid;
		}



	    
	    

	
	

}
