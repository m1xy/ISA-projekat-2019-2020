package com.isa.backend.model.clinic;

import java.util.ArrayList;

import com.isa.backend.model.user.Lekar;
import com.isa.backend.model.user.Patient;

public class Operacija {

	private String datum;
	private String vreme; // satnica
	private String trajanje;
	private Sala sala;
	private ArrayList<Lekar> lekari;

	private Patient pacijent;

	public Operacija() {
		// TODO Auto-generated constructor stub
	}

	public Operacija(String datum, String vreme, String trajanje, Sala sala, ArrayList<Lekar> lekari,
			Patient pacijent) {
		super();
		this.datum = datum;
		this.vreme = vreme;
		this.trajanje = trajanje;
		this.sala = sala;
		this.lekari = lekari;
		this.pacijent = pacijent;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

	public String getTrajanje() {
		return trajanje;
	}

	public void setTrajanje(String trajanje) {
		this.trajanje = trajanje;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public ArrayList<Lekar> getLekari() {
		return lekari;
	}

	public void setLekari(ArrayList<Lekar> lekari) {
		this.lekari = lekari;
	}

	public Patient getPacijent() {
		return pacijent;
	}

	public void setPacijent(Patient pacijent) {
		this.pacijent = pacijent;
	}

}
