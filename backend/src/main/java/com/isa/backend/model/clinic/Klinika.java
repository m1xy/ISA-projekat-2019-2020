package com.isa.backend.model.clinic;

import java.util.ArrayList;

import com.isa.backend.model.user.AdministratorKlinike;
import com.isa.backend.model.user.Lekar;

public class Klinika {

	private String naziv;
	private String adresa; // mapa
	private String opis;
	private ArrayList<Pregled> pregledi;
	private ArrayList<Lekar> lekari;
	private ArrayList<Sala> sale;
	private ArrayList<String> cene; // ?map

	private ArrayList<AdministratorKlinike> administratoriKlinike;
	private double ocena;

	public Klinika() {
		// TODO Auto-generated constructor stub
	}

	public Klinika(String naziv, String adresa, String opis, ArrayList<Pregled> pregledi, ArrayList<Lekar> lekari,
			ArrayList<Sala> sale, ArrayList<String> cene, ArrayList<AdministratorKlinike> administratoriKlinike,
			double ocena) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.opis = opis;
		this.pregledi = pregledi;
		this.lekari = lekari;
		this.sale = sale;
		this.cene = cene;
		this.administratoriKlinike = administratoriKlinike;
		this.ocena = ocena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public ArrayList<Pregled> getPregledi() {
		return pregledi;
	}

	public void setPregledi(ArrayList<Pregled> pregledi) {
		this.pregledi = pregledi;
	}

	public ArrayList<Lekar> getLekari() {
		return lekari;
	}

	public void setLekari(ArrayList<Lekar> lekari) {
		this.lekari = lekari;
	}

	public ArrayList<Sala> getSale() {
		return sale;
	}

	public void setSale(ArrayList<Sala> sale) {
		this.sale = sale;
	}

	public ArrayList<String> getCene() {
		return cene;
	}

	public void setCene(ArrayList<String> cene) {
		this.cene = cene;
	}

	public ArrayList<AdministratorKlinike> getAdministratoriKlinike() {
		return administratoriKlinike;
	}

	public void setAdministratoriKlinike(ArrayList<AdministratorKlinike> administratoriKlinike) {
		this.administratoriKlinike = administratoriKlinike;
	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(double ocena) {
		this.ocena = ocena;
	}

}
