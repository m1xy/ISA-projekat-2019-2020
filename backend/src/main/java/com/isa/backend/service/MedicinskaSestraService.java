package com.isa.backend.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.user.MedicinskaSestra;
import com.isa.backend.repository.MedicinskaSestraRepository;

@Service
public class MedicinskaSestraService {

	@Autowired
	private MedicinskaSestraRepository medSestraRepository;
	
	public List<MedicinskaSestra> getAllMedicinskaSestra(){
	List<MedicinskaSestra> medicinskaSestras = new ArrayList<>();
		medSestraRepository.findAll().forEach(medicinskaSestras::add);
		return medicinskaSestras;
	}
	
	public Optional<MedicinskaSestra> getMedicinskaSestra(Long id) {
	return medSestraRepository.findById(id);
	}
	
	public void addMedicinskaSestra(MedicinskaSestra medicinskaSestra) {
		medSestraRepository.save(medicinskaSestra);
	}
	
	public void updateMedicinskaSestra(Long id,MedicinskaSestra medicinskaSestra) {
		medSestraRepository.save(medicinskaSestra);
	}
	
	public void deleteMedicinskaSestra(Long id) {
		medSestraRepository.deleteById(id);
	}
}
