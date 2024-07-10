package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Mall_Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
		private String Name;
		private String Password;
		private Long Phonenumber;
			

		public Mall_Admin(Long id, String name, String password, Long phonenumber) {
			super();
			Id = id;
			Name = name;
			Password = password;
			Phonenumber = phonenumber;
		}
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public Long getPhonenumber() {
			return Phonenumber;
		}
		public void setPhonenumber(Long phonenumber) {
			Phonenumber = phonenumber;
		}
		

		
		public Mall_Admin() {
			super();
		}
		
		
		@Override
		public String toString() {
			return "Mall_Admin [Id=" + Id + ", Name=" + Name + ", Password=" + Password + ", Phonenumber=" + Phonenumber
					+ "]";
		}

		
}
