package com.example.adminservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Admin {
	@Id
	int movie_id;
    String movie_name;
    int release_year;
    String language;
    int rating;
    int duration_in_minutes;
    String movie_type;
    String director_name;
    String lead_actor_name1;
    String lead_actor_name2;
    String movie_category;
    int rental_cost;
    public Admin() {
    	
    }
	public Admin(int movie_id, String movie_name, int release_year, String language, int rating,
			int duration_in_minutes, String movie_type, String director_name, String lead_actor_name1,
			String lead_actor_name2, String movie_category, int rental_cost) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.release_year = release_year;
		this.language = language;
		this.rating = rating;
		this.duration_in_minutes = duration_in_minutes;
		this.movie_type = movie_type;
		this.director_name = director_name;
		this.lead_actor_name1 = lead_actor_name1;
		this.lead_actor_name2 = lead_actor_name2;
		this.movie_category = movie_category;
		this.rental_cost = rental_cost;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getRelease_year() {
		return release_year;
	}
	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getDuration_in_minutes() {
		return duration_in_minutes;
	}
	public void setDuration_in_minutes(int duration_in_minutes) {
		this.duration_in_minutes = duration_in_minutes;
	}
	public String getMovie_type() {
		return movie_type;
	}
	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}
	public String getDirector_name() {
		return director_name;
	}
	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}
	public String getLead_actor_name1() {
		return lead_actor_name1;
	}
	public void setLead_actor_name1(String lead_actor_name1) {
		this.lead_actor_name1 = lead_actor_name1;
	}
	public String getLead_actor_name2() {
		return lead_actor_name2;
	}
	public void setLead_actor_name2(String lead_actor_name2) {
		this.lead_actor_name2 = lead_actor_name2;
	}
	public String getMovie_category() {
		return movie_category;
	}
	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}
	public int getRental__cost() {
		return rental_cost;
	}
	public void setRental__cost(int rental__cost) {
		this.rental_cost = rental__cost;
	}
    
}
