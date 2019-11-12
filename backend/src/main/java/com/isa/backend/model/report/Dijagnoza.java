package com.isa.backend.model.report;

public class Dijagnoza {

	private String naziv;
	private String id;

	public Dijagnoza() {
		// TODO Auto-generated constructor stub
	}

	public Dijagnoza(String naziv, String id) {
		super();
		this.naziv = naziv;
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
