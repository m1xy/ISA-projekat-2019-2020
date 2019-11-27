package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.report.Dijagnoza;
import com.isa.backend.repository.DijagnozaRepository;

@Service
public class DijagnozaService {

	@Autowired
	private DijagnozaRepository dijagnozaRepository;
	
	public List<Dijagnoza> getAllDijagnozas(){
		List<Dijagnoza> dijagnozas = new ArrayList<>();
			dijagnozaRepository.findAll().forEach(dijagnozas::add);
			return dijagnozas;
		}
		
		public Optional<Dijagnoza> getDijagnoza(Long id) {
		return dijagnozaRepository.findById(id);
		}
		
		public void addDijagnoza(Dijagnoza dijagnoza) {
			dijagnozaRepository.save( dijagnoza);
		}
		
		public void updateDijagnoza(Long id,Dijagnoza dijagnoza) {
			dijagnozaRepository.save(dijagnoza);
		}
		
		public void deleteDijagnoza(Long id) {
			dijagnozaRepository.deleteById(id);
		}
	
}
