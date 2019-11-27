package com.isa.backend.dto;

import com.isa.backend.model.clinic.Sala;

public class SalaDTO {
	
	private Long id; 
	private String naziv;
	private String broj;
	private boolean rezervisana;
	
	
	public SalaDTO() {
		
	}
	
	public SalaDTO(Sala sala) {
		this(sala.getId(),sala.getNaziv(),sala.getBroj(),sala.isRezervisana());
	}

	public SalaDTO(Long id, String naziv, String broj, boolean rezervisana) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.broj = broj;
		this.rezervisana = rezervisana;
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
