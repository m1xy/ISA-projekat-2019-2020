package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.report.Lek;
import com.isa.backend.repository.LekRepository;

@Service
public class LekService {
	
	@Autowired
	private LekRepository lekRepository;
	
	public List<Lek> getAllLeks(){
		List<Lek> leks = new ArrayList<>();
			lekRepository.findAll().forEach(leks::add);
			return leks;
		}
		
		public Optional<Lek> getLek(Long id) {
		return lekRepository.findById(id);
		}
		
		public void addLek(Lek lek) {
			lekRepository.save(lek);
		}
		
		public void updateLek(Long id,Lek lek) {
			lekRepository.save(lek);
		}
		
		public void deleteLek(Long id) {
			lekRepository.deleteById(id);
		}

}
