package com.isa.backend.model.report;

import java.util.ArrayList;

public class ZdravstveniKarton {

	private ArrayList<IzvestajPregleda> izvestaji;

	public ZdravstveniKarton() {
		// TODO Auto-generated constructor stub
	}

	public ZdravstveniKarton(ArrayList<IzvestajPregleda> izvestaji) {
		super();
		this.izvestaji = izvestaji;
	}

	public ArrayList<IzvestajPregleda> getIzvestaji() {
		return izvestaji;
	}

	public void setIzvestaji(ArrayList<IzvestajPregleda> izvestaji) {
		this.izvestaji = izvestaji;
	}

}
