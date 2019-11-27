package com.isa.backend.model.clinic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //baza generise id po redu pocev od 1;
	private Long id; 
	
	@Column(unique = true, nullable = false)
	private String naziv;
	@Column(unique = true, nullable = false)
	private String broj;

	@Column(nullable = false)
	private boolean rezervisana;

	public Sala() {
		// TODO Auto-generated constructor stub
	}

	public Sala(String naziv, String broj, boolean rezervisana) {
		super();
		this.naziv = naziv;
		this.broj = broj;
		this.rezervisana = rezervisana;
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

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public boolean isRezervisana() {
		return rezervisana;
	}

	public void setRezervisana(boolean rezervisana) {
		this.rezervisana = rezervisana;
	}

}
