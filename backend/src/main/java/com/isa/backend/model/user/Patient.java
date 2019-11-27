package com.isa.backend.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.isa.backend.model.report.ZdravstveniKarton;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //baza generise id po redu pocev od 1;
	private Long id; //iskoriscena klasa Long jer id moze biti null

	@Column(unique = true, nullable = false)
	private String username;
	
	@Column(unique = true, nullable = false)
	private String password;

	@Column(nullable = false)
	private String ime;
	
	@Column(nullable = false)
	private String prezime;
	
	@Column(nullable = false)
	private String adresa;
	
	@Column(nullable = false)
	private String grad;
	
	@Column(nullable = false)
	private String drzava;
	
	//	@Column(nullable = false) ??
	private String brojTelefona;
	
	//email? treba?
	@Column(unique = true, nullable = false)
	private String brojOsiguranika;

//	private ZdravstveniKarton zdravstveniKarton;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String username, String password, String ime, String prezime, String adresa, String grad,
			String drzava, String brojTelefona, String brojOsiguranika/*, ZdravstveniKarton zdravstveniKarton*/) {
		super();
		this.username = username;
		this.password = password;
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.grad = grad;
		this.drzava = drzava;
		this.brojTelefona = brojTelefona;
		this.brojOsiguranika = brojOsiguranika;
//		this.zdravstveniKarton = zdravstveniKarton;
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

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public String getBrojOsiguranika() {
		return brojOsiguranika;
	}

	public void setBrojOsiguranika(String brojOsiguranika) {
		this.brojOsiguranika = brojOsiguranika;
	}

//	public ZdravstveniKarton getZdravstveniKarton() {
//		return zdravstveniKarton;
//	}
//
//	public void setZdravstveniKarton(ZdravstveniKarton zdravstveniKarton) {
//		this.zdravstveniKarton = zdravstveniKarton;
//	}

}
