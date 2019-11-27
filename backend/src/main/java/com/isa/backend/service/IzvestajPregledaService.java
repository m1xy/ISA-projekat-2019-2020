package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.report.IzvestajPregleda;
import com.isa.backend.repository.IzvestajPregledaRepository;

@Service
public class IzvestajPregledaService {

	@Autowired
	private IzvestajPregledaRepository izvPreReopsitory;
	
	public List<IzvestajPregleda> getAllIzvestajPregledas(){
		List<IzvestajPregleda> izvPregledas = new ArrayList<>();
			izvPreReopsitory.findAll().forEach(izvPregledas::add);
			return izvPregledas ;
		}
		
		public Optional<IzvestajPregleda> getIzvestajPregleda(Long id) {
		return izvPreReopsitory.findById(id);
		}
		
		public void addIzvestajPregleda(IzvestajPregleda izvPregleda) {
			izvPreReopsitory.save(izvPregleda);
		}
		
		public void updateIzvestajPregleda(Long id,IzvestajPregleda izvPregleda) {
			izvPreReopsitory.save(izvPregleda);
		}
		
		public void deleteIzvestajPregleda(Long id) {
			izvPreReopsitory.deleteById(id);
		}
	
	
}
