package com.isa.backend.dto;

import javax.persistence.Column;

import com.isa.backend.model.user.AdministratorKlinike;

public class AdministratorKlinikeDTO {

	private Long id; 
	private String username;
	private String password;
//	private KlinikaDTO klinika;
	
	public AdministratorKlinikeDTO() {
		
	}
	
	public AdministratorKlinikeDTO(AdministratorKlinike adminKlinike) {
		this(adminKlinike.getId(),adminKlinike.getUsername(),adminKlinike.getPassword());
	}
	
	public AdministratorKlinikeDTO(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
