package com.isa.backend.model.clinic;

public class Sala {

	private String naziv;
	private String broj;

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
