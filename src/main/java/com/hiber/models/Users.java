package com.hiber.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usersinfo")
public class Users {
	
		@Id
		@GeneratedValue
		private int userid;
		private String username;
		private String password;
		private String personname;
		
		
		
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPersonname() {
			return personname;
		}
		public void setPersonname(String personname) {
			this.personname = personname;
		}
		
		
		
		
		
		


}
