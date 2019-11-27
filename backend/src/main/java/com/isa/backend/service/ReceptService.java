package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.report.Recept;
import com.isa.backend.repository.ReceptRepository;

@Service
public class ReceptService {
	
	@Autowired
	private ReceptRepository receptRepository;
	
	public List<Recept> getAllRecepts(){
		List<Recept> recepts = new ArrayList<>();
			receptRepository.findAll().forEach(recepts::add);
			return recepts;
		}
		
		public Optional<Recept> getRecept(Long id) {
		return receptRepository.findById(id);
		}
		
		public void addRecept(Recept recept) {
			receptRepository.save(recept);
		}
		
		public void updateRecept(Long id,Recept recept) {
			receptRepository.save(recept);
		}
		
		public void deleteRecept(Long id) {
			receptRepository.deleteById(id);
		}
}
