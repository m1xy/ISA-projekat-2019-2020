package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.user.Lekar;
import com.isa.backend.repository.LekarRepository;

@Service
public class LekarService {

	@Autowired
	private LekarRepository lekarRepository;
	
	public List<Lekar> getAllLekars(){
		List<Lekar> lekars = new ArrayList<>();
		 	lekarRepository.findAll().forEach(lekars::add);
			return lekars;
		}
		
		public Optional<Lekar> getLekar(Long id) {
			return lekarRepository.findById(id);
		}
		
		public void addLekar(Lekar lekar) {
			 lekarRepository.save(lekar);
		}
		
		public void updateLekar(Long id,Lekar lekar) {
			 lekarRepository.save(lekar);
		}
		
		public void deleteLekar(Long id) {
			 lekarRepository.deleteById(id);
		}
}
