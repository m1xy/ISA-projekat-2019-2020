package com.isa.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isa.backend.model.user.AdministratorKlinike;
import com.isa.backend.repository.AdministratorKlinikeRepository;


@Service
public class AdministratorKlinikeService {
	@Autowired
	private AdministratorKlinikeRepository adminKlinikeRepository;
	
	public List<AdministratorKlinike> getAllAdministratorKlinikes(){
	List<AdministratorKlinike> administratorKlinikes = new ArrayList<>();
		adminKlinikeRepository.findAll().forEach(administratorKlinikes::add);
		return administratorKlinikes;
	}
	
	public Optional<AdministratorKlinike> getAdministratorKlinike(Long id) {
		return adminKlinikeRepository.findById(id);
	}
	
	public void addAdministratorKlinike(AdministratorKlinike administratorKlinike) {
		adminKlinikeRepository.save(administratorKlinike);
	}
	
	public void updateAdministratorKlinike(Long id,AdministratorKlinike adminKlinike) {
		adminKlinikeRepository.save(adminKlinike);
	}
	
	public void deleteAdministratorKlinike(Long id) {
		adminKlinikeRepository.deleteById(id);
	}
}
