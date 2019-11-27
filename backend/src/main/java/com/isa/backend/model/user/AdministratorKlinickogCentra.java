package com.isa.backend.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
@Entity
public class AdministratorKlinickogCentra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, nullable = false)
	private String username;
	
	@Column(unique = true, nullable = false)
	private String password;

	//Klinicki centar????
	
	//Postoji jedan predefinisan administrator klinickog centra koji moze da dodaje druge administratore klinickog centra.
	public AdministratorKlinickogCentra() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdministratorKlinickogCentra(String username, String password) {
		super();
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
