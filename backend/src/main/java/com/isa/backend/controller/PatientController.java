package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.user.Patient;
import com.isa.backend.service.PatientService;

@RestController
//@RequestMapping(value = "api/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	//Za tesitranje da li radi u browseru 
	@RequestMapping("/hello/patient")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello World!</h1></div>"; 
	}
	
	@RequestMapping("/patients")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/patients/{id}")
	public Optional<Patient> getPatient(@PathVariable Long id){
		return patientService.getPatient(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/patients")
	public void addPatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/patients/{id}")
	public void updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
		patientService.updatePatient(id, patient);
	}
	
	@RequestMapping(value="/patients/{id}", method=RequestMethod.DELETE)
	public void deletePatient(@PathVariable Long id) {
		patientService.deletePatient(id);
	}

}