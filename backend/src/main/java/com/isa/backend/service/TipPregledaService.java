package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.clinic.TipPregleda;
import com.isa.backend.repository.TipPregledaRepository;

@Service
public class TipPregledaService {

	@Autowired
	private TipPregledaRepository tipPregledaRepository;
	
	
	public List<TipPregleda> getAllTipPregledas(){
		List<TipPregleda> tipPregledas = new ArrayList<>();
			tipPregledaRepository.findAll().forEach(tipPregledas::add);
			return tipPregledas;
		}
		
		public Optional<TipPregleda> getTipPregleda(Long id) {
		return	tipPregledaRepository.findById(id);
		}
		
		public void addTipPregleda(TipPregleda tipPregleda) {
			tipPregledaRepository.save(tipPregleda);
		}
		
		public void updateTipPregleda(Long id,TipPregleda tipPregleda) {
			tipPregledaRepository.save(tipPregleda);
		}
		
		public void deleteTipPregleda(Long id) {
			tipPregledaRepository.deleteById(id);
		}
}
