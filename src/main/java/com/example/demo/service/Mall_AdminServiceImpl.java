package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Mall_Admin;
import com.example.demo.repository.Mall_AdminRepository;

@Service
public  class Mall_AdminServiceImpl implements Mall_AdminService {
	
	@Autowired
	 Mall_AdminRepository mr;
	
	@Override
	public Mall_Admin saveMall_Admin(Mall_Admin malladmin) {
		return mr.save(malladmin);
		
	}

	@Override
	public List<Mall_Admin> fetchMall_AdminList() {
		return mr.findAll();
	}
	
	@Override 
	public Mall_Admin fetchMall_AdminById(Long Id) {
		return mr.findById(Id).get();
	}


	@Override
	public void deleteMall_AdminById(Long Id) {
		mr.deleteById(Id);
		
	}

	@Override
	public Mall_Admin updateMall_Admin(Long Id, Mall_Admin malladmin) {
		Mall_Admin ma = mr.findById(Id).get();

		 if(Objects.nonNull(malladmin.getName()) &&
			       !"".equalsIgnoreCase(malladmin.getName())) {
			           ma.setName(malladmin.getName());
			       }

			       if(Objects.nonNull(malladmin.getPassword()) &&
			               !"".equalsIgnoreCase(malladmin.getPassword())) {
			           ma.setPassword(malladmin.getPassword());
			       }

			       if(Objects.nonNull(malladmin.getPhonenumber()) &&
			    		   !"".equalsIgnoreCase(malladmin.getPassword()))  {
			           ma.setPhonenumber(malladmin.getPhonenumber());
			       }
	       return mr.save(ma);
		
	}

	}

	




