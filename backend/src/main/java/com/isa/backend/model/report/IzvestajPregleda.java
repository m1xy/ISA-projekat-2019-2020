package com.isa.backend.model.report;

import java.util.ArrayList;

public class IzvestajPregleda {

	private Dijagnoza dijagnoza;
	private ArrayList<Recept> recepti;

	public IzvestajPregleda() {
		// TODO Auto-generated constructor stub
	}

	public IzvestajPregleda(Dijagnoza dijagnoza, ArrayList<Recept> recepti) {
		super();
		this.dijagnoza = dijagnoza;
		this.recepti = recepti;
	}

	public Dijagnoza getDijagnoza() {
		return dijagnoza;
	}

	public void setDijagnoza(Dijagnoza dijagnoza) {
		this.dijagnoza = dijagnoza;
	}

	public ArrayList<Recept> getRecepti() {
		return recepti;
	}

	public void setRecepti(ArrayList<Recept> recepti) {
		this.recepti = recepti;
	}

}
