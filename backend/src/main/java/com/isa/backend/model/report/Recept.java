package com.isa.backend.model.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import java.util.ArrayList;

import com.isa.backend.model.user.MedicinskaSestra;

@Entity
public class Recept {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private ArrayList<Lek> lekovi;
	
//	@Column(nullable = false)
//	private MedicinskaSestra medicinskaSestra;

	public Recept() {
		// TODO Auto-generated constructor stub
	}

	public Recept(ArrayList<Lek> lekovi, MedicinskaSestra medicinskaSestra) {
		super();
		this.lekovi = lekovi;
		//this.medicinskaSestra = medicinskaSestra;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<Lek> getLekovi() {
		return lekovi;
	}

	public void setLekovi(ArrayList<Lek> lekovi) {
		this.lekovi = lekovi;
	}

//	public MedicinskaSestra getMedicinskaSestra() {
//		return medicinskaSestra;
//	}
//
//	public void setMedicinskaSestra(MedicinskaSestra medicinskaSestra) {
//		this.medicinskaSestra = medicinskaSestra;
//	}

}
