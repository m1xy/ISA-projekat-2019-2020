package com.isa.backend.model.report;

import java.util.ArrayList;

import com.isa.backend.model.user.MedicinskaSestra;

public class Recept {

	private ArrayList<Lek> lekovi;
	private MedicinskaSestra medicinskaSestra;

	public Recept() {
		// TODO Auto-generated constructor stub
	}

	public Recept(ArrayList<Lek> lekovi, MedicinskaSestra medicinskaSestra) {
		super();
		this.lekovi = lekovi;
		this.medicinskaSestra = medicinskaSestra;
	}

	public ArrayList<Lek> getLekovi() {
		return lekovi;
	}

	public void setLekovi(ArrayList<Lek> lekovi) {
		this.lekovi = lekovi;
	}

	public MedicinskaSestra getMedicinskaSestra() {
		return medicinskaSestra;
	}

	public void setMedicinskaSestra(MedicinskaSestra medicinskaSestra) {
		this.medicinskaSestra = medicinskaSestra;
	}

}
