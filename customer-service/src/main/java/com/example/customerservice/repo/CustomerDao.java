package com.example.customerservice.repo;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customerservice.Customer;

	@Repository
	@Transactional
	public interface CustomerDao extends JpaRepository<Customer,Integer> {

	}


