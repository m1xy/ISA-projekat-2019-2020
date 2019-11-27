package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.clinic.Klinika;
import com.isa.backend.repository.KlinikaRepository;

@Service
public class KlinikaService {

	@Autowired
	private KlinikaRepository klinikaRepository;
	
	public List<Klinika> getAllKlinikas(){
		List<Klinika> klinikas = new ArrayList<>();
			klinikaRepository.findAll().forEach(klinikas::add);
			return klinikas;
		}
		
		public Optional<Klinika> getKlinika(Long id) {
			return klinikaRepository.findById(id);
		}
		
		public void addKlinika(Klinika klinika) {
			klinikaRepository.save(klinika);
		}
		
		public void updateKlinika(Long id,Klinika klinika) {
			klinikaRepository.save(klinika);
		}
		
		public void deleteKlinika(Long id) {
			klinikaRepository.deleteById(id);
		}
}
