package com.isa.backend.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.isa.backend.model.clinic.Klinika;

@Entity
public class MedicinskaSestra {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 

	@Column(unique = true, nullable = false)
	private String username;
	@Column(unique = true, nullable = false)
	private String password;

	@Column(nullable = false)
	private String ime;
	
	@Column(nullable = false)
	private String prezime;

//	@Column(nullable = false)
//	private Klinika klinika;

	
	//Medicinsko osoblje lekari i medicinske sestre mogu biti zaposleni samo na jednoj klinici
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
//		this.klinika = klinika;
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

//	public Klinika getKlinika() {
//		return klinika;
//	}
//
//	public void setKlinika(Klinika klinika) {
//		this.klinika = klinika;
//	}

}
