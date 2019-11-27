package com.isa.backend.model.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.ArrayList;

@Entity
public class ZdravstveniKarton {
	
	//	Da li treba uopste id 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;

	private ArrayList<IzvestajPregleda> izvestaji;

	public ZdravstveniKarton() {
		// TODO Auto-generated constructor stub
	}

	public ZdravstveniKarton(ArrayList<IzvestajPregleda> izvestaji) {
		super();
		this.izvestaji = izvestaji;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<IzvestajPregleda> getIzvestaji() {
		return izvestaji;
	}

	public void setIzvestaji(ArrayList<IzvestajPregleda> izvestaji) {
		this.izvestaji = izvestaji;
	}

}
