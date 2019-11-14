package com.isa.backend.model.user;

import com.isa.backend.model.clinic.Klinika;

public class AdministratorKlinike {

	private String username;
	private String password;

	private Klinika klinika; // klinika kojoj pripada

	public AdministratorKlinike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdministratorKlinike(String username, String password, Klinika klinika) {
		super();
		this.username = username;
		this.password = password;
		this.klinika = klinika;
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

	public Klinika getKlinika() {
		return klinika;
	}

	public void setKlinika(Klinika klinika) {
		this.klinika = klinika;
	}

}
