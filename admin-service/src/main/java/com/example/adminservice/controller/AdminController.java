package com.example.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.model.Admin;
import com.example.adminservice.service.AdminService;

import java.util
.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Admin>> showAllAdmin(){
		return new ResponseEntity(service.getAllAdmin(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
		return new ResponseEntity(service.insertAdmin(admin),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{movie_id}")
	public ResponseEntity<String> deleteMovie(@PathVariable("movie_id") int movie_id) {
		
		return new ResponseEntity<String>(service.deleteMovieById(movie_id),HttpStatus.ACCEPTED);

	}
	

}
