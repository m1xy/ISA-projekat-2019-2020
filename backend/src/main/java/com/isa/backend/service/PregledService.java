package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.clinic.Pregled;
import com.isa.backend.repository.PregledRepository;

@Service
public class PregledService {
	
	@Autowired
	private PregledRepository pregledRepository;
	
	public List<Pregled> getAllPregleds(){
		List<Pregled> pregleds = new ArrayList<>();
			pregledRepository.findAll().forEach(pregleds::add);
			return pregleds;
		}
		
		public Optional<Pregled> getPregled(Long id) {
			return pregledRepository.findById(id);
		}
		
		public void addPregled(Pregled pregled) {
			pregledRepository.save(pregled);
		}
		
		public void updatePregled(Long id,Pregled pregled) {
			pregledRepository.save(pregled);
		}
		
		public void deletePregled(Long id) {
			pregledRepository.deleteById(id);
		}
	
}
