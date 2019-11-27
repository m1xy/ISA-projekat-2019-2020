package com.isa.backend.model.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.ArrayList;

@Entity
public class IzvestajPregleda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//private Dijagnoza dijagnoza;
	private ArrayList<Recept> recepti;

	public IzvestajPregleda() {
		// TODO Auto-generated constructor stub
	}

	public IzvestajPregleda(Dijagnoza dijagnoza, ArrayList<Recept> recepti) {
		super();
		//this.dijagnoza = dijagnoza;
		this.recepti = recepti;
	}
	
	

//	public Dijagnoza getDijagnoza() {
//		return dijagnoza;
//	}

//	public void setDijagnoza(Dijagnoza dijagnoza) {
//		this.dijagnoza = dijagnoza;
//	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<Recept> getRecepti() {
		return recepti;
	}

	public void setRecepti(ArrayList<Recept> recepti) {
		this.recepti = recepti;
	}

}
