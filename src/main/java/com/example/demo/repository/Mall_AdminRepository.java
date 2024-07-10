package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Mall_Admin;

@Repository

public interface Mall_AdminRepository  extends JpaRepository<Mall_Admin, Long>{

}
