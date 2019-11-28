package com.isa.backend.dto;

import com.isa.backend.model.user.MedicinskaSestra;

public class MedicinskaSestraDTO {

	private Long id; 

	private String username;

	private String password;

	private String ime;
	
	private String prezime;
	
	public MedicinskaSestraDTO() {
		
	}
	
public MedicinskaSestraDTO(MedicinskaSestra medSestra) {
		this(medSestra.getId(),medSestra.getUsername(),medSestra.getPassword(),medSestra.getIme(),medSestra.getPrezime());
}

	public MedicinskaSestraDTO(Long id,String username, String password, String ime, String prezime) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.ime = ime;
		this.prezime = prezime;
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

}