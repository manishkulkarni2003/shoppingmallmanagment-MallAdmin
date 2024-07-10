package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Mall_Admin;
import com.example.demo.service.Mall_AdminService;

@RestController
public class Mall_AdminController {
	

	@Autowired
	Mall_AdminService ms;
	
	@PostMapping("/malladmin")
	public Mall_Admin saveDepartment(@RequestBody Mall_Admin malladmin) {
		
		return ms.saveMall_Admin(malladmin);
	}
	
	@GetMapping("/malladmin")
    public List<Mall_Admin> fetchMall_AdminList() {
		//LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return  ms.fetchMall_AdminList();
    }
    


    @GetMapping("/malladmin/{id}")
    public  Mall_Admin fetchMall_AdminById(@PathVariable("id") Long Id)
            {
        return ms.fetchMall_AdminById(Id);
    }
    
    
    @DeleteMapping("/malladmin/{id}")
    public String malladminId(@PathVariable("id") Long Id) {
        ms.deleteMall_AdminById(Id);
        return " deleted Successfully!!";
    }
    
    @PutMapping("/malladmin/{id}")
    public Mall_Admin updateMall_Admin(@PathVariable("id") Long Id,
                                       @RequestBody Mall_Admin malladmin) {
        return ms.updateMall_Admin(Id,malladmin);
    }
}
