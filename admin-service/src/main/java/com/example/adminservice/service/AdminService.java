package com.example.adminservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.util.MultiValueMap;

import com.example.adminservice.model.Admin;


public interface AdminService {
	public List<Admin> getAllAdmin();
	public Admin insertAdmin(Admin admin);
	public String deleteAdmin(Admin admin);
	public Optional<Admin> findBymovie_id(int movie_id);
	public String deleteMovieById(int movie_id);	
	

}
