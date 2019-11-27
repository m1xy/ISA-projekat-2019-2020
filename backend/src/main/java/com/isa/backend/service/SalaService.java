package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.clinic.Sala;
import com.isa.backend.repository.SalaRepository;

@Service
public class SalaService {

	@Autowired
	private SalaRepository salaRepository;
	
	public List<Sala> getAllSalas(){
		List<Sala> salas = new ArrayList<>();
			salaRepository.findAll().forEach(salas::add);
			return salas;
		}
		
		public Optional<Sala> getSala(Long id) {
			return salaRepository.findById(id);
		}
		
		public void addSala(Sala sala) {
			salaRepository.save(sala);
		}
		
		public void updateSala(Long id,Sala sala) {
			salaRepository.save(sala);
		}
		
		public void deleteSala(Long id) {
			salaRepository.deleteById(id);
		}
	
}
