package com.example.customerservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerservice.repo.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao dao;
	
	@Override
	public List<Customer> getAllCustomer(){
		return dao.findAll();
	}

	@Override
	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}

	@Override
	public Optional<Customer> findBycustomer_id(int customer_id) {
		// TODO Auto-generated method stub
		return dao.findById(customer_id);
	}

	@Override
	public List<Customer> searchMovieBymovie_type(String movie_type) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
