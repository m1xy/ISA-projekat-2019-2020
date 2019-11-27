package com.isa.backend.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.user.AdministratorKlinickogCentra;
import com.isa.backend.repository. AdministratorKlinickogCentraRepository;

@Service
public class AdministratorKlinickogCentraService {
	@Autowired
	private  AdministratorKlinickogCentraRepository  adminKlinCentraRepository;
	
	public List< AdministratorKlinickogCentra> getAllAdministratorKlinickogCentras(){
		List< AdministratorKlinickogCentra>  adminKlinCentras = new ArrayList<>();
			adminKlinCentraRepository.findAll().forEach(adminKlinCentras::add);
			return adminKlinCentras;
		}
		
		public Optional<AdministratorKlinickogCentra> getAdministratorKlinickogCentra(Long id) {
			return adminKlinCentraRepository.findById(id);
		}
		
		public void addAdministratorKlinickogCentra( AdministratorKlinickogCentra adminKlinCentra) {
			adminKlinCentraRepository.save(adminKlinCentra);
		}
		
		public void updateAdministratorKlinickogCentra(Long id, AdministratorKlinickogCentra adminKlinCentra) {
			adminKlinCentraRepository.save(adminKlinCentra);
		}
		
		public void deleteAdministratorKlinickogCentra(Long id) {
			adminKlinCentraRepository.deleteById(id);
		}
}
