package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.report.ZdravstveniKarton;
import com.isa.backend.repository.ZdravstveniKartonRepository;

@Service
public class ZdravstveniKartonService {
	
	@Autowired
	private ZdravstveniKartonRepository zdrKartonRepository;
	
	
	public List<ZdravstveniKarton> getAllZdravstveniKartons(){
		List<ZdravstveniKarton> zdrKartons = new ArrayList<>();
			zdrKartonRepository.findAll().forEach(zdrKartons::add);
			return zdrKartons;
		}
		
		public Optional<ZdravstveniKarton> getZdravstveniKarton(Long id) {
		return zdrKartonRepository.findById(id);
		}
		
		public void addZdravstveniKarton(ZdravstveniKarton zdrKarto) {
			zdrKartonRepository.save(zdrKarto);
		}
		
		public void updateZdravstveniKarton(Long id,ZdravstveniKarton zdrKarto) {
			zdrKartonRepository.save(zdrKarto);
		}
		
		public void deleteZdravstveniKarton(Long id) {
			zdrKartonRepository.deleteById(id);
		}
}
