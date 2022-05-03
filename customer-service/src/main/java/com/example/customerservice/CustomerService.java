package com.example.customerservice;

import java.util.List;
import java.util.Optional;


public interface CustomerService {
	
		public List<Customer> getAllCustomer();
		public Customer insertCustomer(Customer customer);
		public Optional<Customer> findBycustomer_id(int customer_id);
		public List<Customer> searchMovieBymovie_type(String movie_type);
		
		
}