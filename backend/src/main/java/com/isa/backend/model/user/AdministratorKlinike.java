package com.isa.backend.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.isa.backend.model.clinic.Klinika;

@Entity
public class AdministratorKlinike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 

	@Column(unique = true, nullable = false)
	private String username;
	
	@Column(unique = true, nullable = false)
	private String password;

//	@Column(nullable = false)
//	private Klinika klinika; // klinika kojoj pripada

	//Jedna klinika moze da ima vise administratora, a jedan isti administrator moze biti administrator samo jedne klinike.
	
	public AdministratorKlinike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdministratorKlinike(String username, String password, Klinika klinika) {
		super();
		this.username = username;
		this.password = password;
		//this.klinika = klinika;
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

//	public Klinika getKlinika() {
//		return klinika;
//	}
//
//	public void setKlinika(Klinika klinika) {
//		this.klinika = klinika;
//	}

}
