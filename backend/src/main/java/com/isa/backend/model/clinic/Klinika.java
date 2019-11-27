package com.isa.backend.model.clinic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.ArrayList;

import com.isa.backend.model.user.AdministratorKlinike;
import com.isa.backend.model.user.Lekar;

@Entity
public class Klinika {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String naziv;
	@Column(unique = true, nullable = false)
	private String adresa; // mapa
	
	private String opis;
	
	@Column(nullable = false)
	private ArrayList<Pregled> pregledi;
//	
//	@Column(nullable = false)
//	private ArrayList<Lekar> lekari;
//	
//	@Column(nullable = false)
//	private ArrayList<Sala> sale;
//	
//	@Column(nullable = false)
//	private ArrayList<AdministratorKlinike> administratoriKlinike;
	
	
	@Column(nullable = false)
	private ArrayList<String> cene; // ?map

	
	private double ocena;

	//Medicinsko osoblje lekari i medicinske sestre mogu biti zaposleni samo na jednoj klinici
	//Jedna klinika moze da ima vise administratora, a jedan isti administrator moze biti administrator samo jedne klinike.
	
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
//		this.lekari = lekari;
//		this.sale = sale;
		this.cene = cene;
//		this.administratoriKlinike = administratoriKlinike;
		this.ocena = ocena;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

//	public ArrayList<Lekar> getLekari() {
//		return lekari;
//	}
//
//	public void setLekari(ArrayList<Lekar> lekari) {
//		this.lekari = lekari;
//	}
//
//	public ArrayList<Sala> getSale() {
//		return sale;
//	}
//
//	public void setSale(ArrayList<Sala> sale) {
//		this.sale = sale;
//	}

	public ArrayList<String> getCene() {
		return cene;
	}

	public void setCene(ArrayList<String> cene) {
		this.cene = cene;
	}

//	public ArrayList<AdministratorKlinike> getAdministratoriKlinike() {
//		return administratoriKlinike;
//	}
//
//	public void setAdministratoriKlinike(ArrayList<AdministratorKlinike> administratoriKlinike) {
//		this.administratoriKlinike = administratoriKlinike;
//	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(double ocena) {
		this.ocena = ocena;
	}

}
