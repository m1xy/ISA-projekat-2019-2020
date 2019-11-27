package com.isa.backend.model.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lek {

	//??
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //baza generise id po redu pocev od 1;
	private Long id; 

	@Column(unique = true, nullable = false)
	private String naziv;
	//Promenio da kluc leka bude long izbacivao error!
//	@Column(unique = true, nullable = false)
//	private String id;

	public Lek() {
		// TODO Auto-generated constructor stub
	}

	public Lek(String naziv, Long id) {
		super();
		this.naziv = naziv;
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}



}
