package com.isa.backend.model.user;

import com.isa.backend.model.clinic.Klinika;

public class MedicinskaSestra {

	private String username;
	private String password;

	private String ime;
	private String prezime;

	private Klinika klinika;

	public MedicinskaSestra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicinskaSestra(String username, String password, String ime, String prezime, Klinika klinika) {
		super();
		this.username = username;
		this.password = password;
		this.ime = ime;
		this.prezime = prezime;
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

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Klinika getKlinika() {
		return klinika;
	}

	public void setKlinika(Klinika klinika) {
		this.klinika = klinika;
	}

}
