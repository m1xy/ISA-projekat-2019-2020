package com.isa.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.isa.backend.model.user.Patient;
import com.isa.backend.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

//	@Autowired
//	private PasswordEncoder passwordEncoder;

//	@Autowired
//	private AuthorityService authService;

	public Patient findByUsername(String username) throws UsernameNotFoundException {
		return patientRepository.findByUsername(username);
	}

	public Patient findById(Long id) throws AccessDeniedException {
		return patientRepository.findById(id).orElseGet(null);
	}

//	private List<Patient> patients = new ArrayList<>(Arrays.asList(
//			new Patient("M","1","Marko","Markovic","Adresa1","Grad1","Drzava1","12345","123"),
//			new Patient("Z","2","Darko","Darkovic","Adresa2","Grad2","Drzava2","12345","123"),
//			new Patient("D","3","Zarko","Zarkovic","Adresa3","Grad3","Drzava3","12345","123")
//));

//	public List<Patient> getAllPatients(){
//		//Prosledjuem pacijente od gore samo da bih testira da li radi get
//		//return patients;
//		List<Patient> patients = new ArrayList<>();
//		patientRepository.findAll().forEach(patients::add);
//		return patients;
//	}

//	public Optional<Patient> getPatient(Long id) {
//		return patientRepository.findById(id);
//	}

//	public void addPatient(Patient patient) {
//		patientRepository.save(patient);
//	}

//	public void updatePatient(Long id,Patient patient) {
//		patientRepository.save(patient);
//	}

//	public void deletePatient(Long id) {
//		patientRepository.deleteById(id);
//	}

}