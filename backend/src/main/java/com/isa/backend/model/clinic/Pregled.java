package com.isa.backend.model.clinic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.isa.backend.model.user.Lekar;
import com.isa.backend.model.user.Patient;

@Entity
public class Pregled {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String datum;
	
	@Column(nullable = false)
	private String vreme; // satnica
	
//	@Column(nullable = false)
//	private TipPregleda tip;
	
	@Column(nullable = false)
	private String trajanje;
	
//	@Column(nullable = false)
//	private Sala sala;
//	
//	@Column(nullable = false)
//	private Lekar lekar;
	
	@Column(nullable = false)
	private String cena;

//@Column(nullable = false) Ako su predefinisani pregledi??
//	private Patient pacijent;

	public Pregled() {
		// TODO Auto-generated constructor stub
	}

	public Pregled(String datum, String vreme, TipPregleda tip, String trajanje, Sala sala, Lekar lekar, String cena,
			Patient pacijent) {
		super();
		this.datum = datum;
		this.vreme = vreme;
//		this.tip = tip;
		this.trajanje = trajanje;
//		this.sala = sala;
//		this.lekar = lekar;
		this.cena = cena;
	//	this.pacijent = pacijent;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

//	public TipPregleda getTip() {
//		return tip;
//	}
//
//	public void setTip(TipPregleda tip) {
//		this.tip = tip;
//	}

	public String getTrajanje() {
		return trajanje;
	}

	public void setTrajanje(String trajanje) {
		this.trajanje = trajanje;
	}

//	public Sala getSala() {
//		return sala;
//	}
//
//	public void setSala(Sala sala) {
//		this.sala = sala;
//	}
//
//	public Lekar getLekar() {
//		return lekar;
//	}
//
//	public void setLekar(Lekar lekar) {
//		this.lekar = lekar;
//	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}

//	public Patient getPacijent() {
//		return pacijent;
//	}
//
//	public void setPacijent(Patient pacijent) {
//		this.pacijent = pacijent;
//	}

}
