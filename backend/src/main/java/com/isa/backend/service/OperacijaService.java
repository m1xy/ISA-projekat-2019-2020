package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.clinic.Operacija;
import com.isa.backend.repository.OperacijaRepository;

@Service
public class OperacijaService {

	@Autowired
	private OperacijaRepository operacijaRepository;
	
	public List<Operacija> getAllOperacijas(){
		List<Operacija> operacijas = new ArrayList<>();
			operacijaRepository.findAll().forEach(operacijas::add);
			return operacijas;
		}
		
		public Optional<Operacija> getOperacija(Long id) {
		return operacijaRepository.findById(id);
		}
		
		public void addOperacija(Operacija operacija) {
			operacijaRepository.save(operacija);
		}
		
		public void updateOperacija(Long id,Operacija operacija) {
			operacijaRepository.save(operacija);
		}
		
		public void deleteOperacija(Long id) {
			operacijaRepository.deleteById(id);
		}
}
