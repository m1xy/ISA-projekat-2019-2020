package com.isa.backend.model.user;

import com.isa.backend.model.clinic.Klinika;
import com.isa.backend.model.clinic.TipPregleda;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lekar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //baza generise id po redu pocev od 1;
	private Long id; 

	@Column(unique = true, nullable = false)
	private String username;
	
	@Column(unique = true, nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String ime;
	
	@Column(nullable = false)
	private String prezime;
	
	//@Column(nullable = false) ??
	private String radnoVreme;
	
	//Zbog povezivanje 
//	@Column(nullable = false)
//	private TipPregleda tipPregleda;

//	@Column(nullable = false)
//	private Klinika klinika;
	
	private double ocena;
	
	//Medicinsko osoblje lekari i medicinske sestre mogu biti zaposleni samo na jednoj klinici
	public Lekar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lekar(String username, String password, String ime, String prezime, String radnoVreme,
			TipPregleda tipPregleda, Klinika klinika, double ocena) {
		super();
		this.username = username;
		this.password = password;
		this.ime = ime;
		this.prezime = prezime;
		this.radnoVreme = radnoVreme;
//		this.tipPregleda = tipPregleda;
//		this.klinika = klinika;
		this.ocena = ocena;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getRadnoVreme() {
		return radnoVreme;
	}

	public void setRadnoVreme(String radnoVreme) {
		this.radnoVreme = radnoVreme;
	}

//	public TipPregleda getTipPregleda() {
//		return tipPregleda;
//	}
//
//	public void setTipPregleda(TipPregleda tipPregleda) {
//		this.tipPregleda = tipPregleda;
//	}

//	public Klinika getKlinika() {
//		return klinika;
//	}
//
//	public void setKlinika(Klinika klinika) {
//		this.klinika = klinika;
//	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(double ocena) {
		this.ocena = ocena;
	}

}
