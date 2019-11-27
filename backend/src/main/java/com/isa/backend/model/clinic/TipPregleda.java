package com.isa.backend.model.clinic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipPregleda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //baza generise id po redu pocev od 1;
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String naziv;

	public TipPregleda() {
		// TODO Auto-generated constructor stub
	}

	public TipPregleda(String naziv) {
		super();
		this.naziv = naziv;
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
