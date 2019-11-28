package com.isa.backend.dto;

import com.isa.backend.model.report.Dijagnoza;

public class DijagnozaDTO {

	private Long id;
	private String naziv;
	
	public DijagnozaDTO() {
		
	}
	
	public DijagnozaDTO(Dijagnoza dijagnoza) {
		this(dijagnoza.getId(),dijagnoza.getNaziv());
	}
	
	public DijagnozaDTO(Long id, String naziv) {
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
