package com.isa.backend.dto;

import com.isa.backend.model.clinic.TipPregleda;

public class TipPregledaDTO {

	private Long id;
	private String naziv;
	
	
	public TipPregledaDTO() {
		
	}
	
	public TipPregledaDTO(TipPregleda tipPregleda) {
		this(tipPregleda.getId(), tipPregleda.getNaziv());
	}
	
	public TipPregledaDTO(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
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
	
	
}
