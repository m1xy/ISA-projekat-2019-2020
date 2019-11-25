package com.isa.backend.model.clinic;

import com.isa.backend.model.user.Lekar;
import com.isa.backend.model.user.Patient;

public class Pregled {

	private String datum;
	private String vreme; // satnica
	private TipPregleda tip;
	private String trajanje;
	private Sala sala;
	private Lekar lekar;
	private String cena;

	private Patient pacijent;

	public Pregled() {
		// TODO Auto-generated constructor stub
	}

	public Pregled(String datum, String vreme, TipPregleda tip, String trajanje, Sala sala, Lekar lekar, String cena,
			Patient pacijent) {
		super();
		this.datum = datum;
		this.vreme = vreme;
		this.tip = tip;
		this.trajanje = trajanje;
		this.sala = sala;
		this.lekar = lekar;
		this.cena = cena;
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

	public TipPregleda getTip() {
		return tip;
	}

	public void setTip(TipPregleda tip) {
		this.tip = tip;
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

	public Lekar getLekar() {
		return lekar;
	}

	public void setLekar(Lekar lekar) {
		this.lekar = lekar;
	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}

	public Patient getPacijent() {
		return pacijent;
	}

	public void setPacijent(Patient pacijent) {
		this.pacijent = pacijent;
	}

}
