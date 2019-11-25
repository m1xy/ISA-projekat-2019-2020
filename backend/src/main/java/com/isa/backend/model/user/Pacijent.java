package com.isa.backend.model.user;

import com.isa.backend.model.report.ZdravstveniKarton;

public class Pacijent {
	
	private String username;
	private String password;

	private String ime;
	private String prezime;
	private String adresa;
	private String grad;
	private String drzava;
	private String brojTelefona;
	private String brojOsiguranika;
	
	private ZdravstveniKarton zdravstveniKarton;

	public Pacijent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pacijent(String username, String password, String ime, String prezime, String adresa, String grad,
			String drzava, String brojTelefona, String brojOsiguranika, ZdravstveniKarton zdravstveniKarton) {
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
		this.zdravstveniKarton = zdravstveniKarton;
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

	public ZdravstveniKarton getZdravstveniKarton() {
		return zdravstveniKarton;
	}

	public void setZdravstveniKarton(ZdravstveniKarton zdravstveniKarton) {
		this.zdravstveniKarton = zdravstveniKarton;
	}

}
