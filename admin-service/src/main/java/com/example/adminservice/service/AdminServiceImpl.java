package com.example.adminservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.model.Admin;
import com.example.adminservice.repo.AdminDao;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao dao;

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Admin insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return dao.save(admin);
	}

	public String deleteMovieById(int movie_id) {
		// TODO Auto-generated method stub
		dao.deleteById(movie_id);
		return "Movie "+movie_id+" Deleted....";
	}

	@Override
	public Optional<Admin> findBymovie_id(int movie_id) {
		// TODO Auto-generated method stub
		return dao.findById(movie_id);
	}

	@Override
	public String deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
