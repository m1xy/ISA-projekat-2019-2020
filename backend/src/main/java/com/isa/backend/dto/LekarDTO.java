package com.isa.backend.dto;

import javax.persistence.Column;

import com.isa.backend.model.user.Lekar;

public class LekarDTO {
	private Long id; 
	private String username;
	private String password;
	private String ime;
	private String prezime;	
	private String radnoVreme;
	private double ocena;
	
	
	public LekarDTO() {
		
	}
	
	public LekarDTO(Lekar lekar) {
		this(lekar.getId(), lekar.getUsername(), lekar.getPassword(), lekar.getIme(), lekar.getPrezime(), lekar.getRadnoVreme(), lekar.getOcena());
	}
	
	
	public LekarDTO(Long id, String username, String password, String ime, String prezime, String radnoVreme,
			double ocena) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.ime = ime;
		this.prezime = prezime;
		this.radnoVreme = radnoVreme;
		this.ocena = ocena;
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
	public String getRadnoVreme() {
		return radnoVreme;
	}
	public void setRadnoVreme(String radnoVreme) {
		this.radnoVreme = radnoVreme;
	}
	public double getOcena() {
		return ocena;
	}
	public void setOcena(double ocena) {
		this.ocena = ocena;
	}
	
}
