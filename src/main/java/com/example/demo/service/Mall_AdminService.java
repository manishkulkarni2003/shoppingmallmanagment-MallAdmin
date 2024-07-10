package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Mall_Admin;

public interface Mall_AdminService {

	
	public Mall_Admin saveMall_Admin(Mall_Admin malladmin);

	public List<Mall_Admin> fetchMall_AdminList();
	
	public Mall_Admin fetchMall_AdminById(Long Id);
	
	public void deleteMall_AdminById(Long Id);

	public  Mall_Admin updateMall_Admin(Long Id, Mall_Admin malladmin);
}

	 

	

	
	

	



