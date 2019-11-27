package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.user.MedicinskaSestra;
import com.isa.backend.service.MedicinskaSestraService;

@RestController
//@RequestMapping(value = "api/patients")
public class MedicinskaSestraController {

	@Autowired
	private MedicinskaSestraService medSestraService;
	
	//Za tesitranje da li radi u browseru 
	@RequestMapping("/hello/medicinskaSestra")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello Medicinska Sestro!</h1></div>"; 
	}
	
	@RequestMapping("/medicinskaSestras")
	public List<MedicinskaSestra> getAllMedicinskaSestras() {
		return medSestraService.getAllMedicinskaSestra();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/medicinskaSestras/{id}")
	public Optional<MedicinskaSestra> getMedicinskaSestra(@PathVariable Long id){
		return medSestraService.getMedicinskaSestra(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/medicinskaSestras")
	public void addMedicinskaSestra(@RequestBody MedicinskaSestra medicinskaSestra) {
		medSestraService.addMedicinskaSestra(medicinskaSestra);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/medicinskaSestras/{id}")
	public void updateMedicinskaSestra(@PathVariable Long id, @RequestBody MedicinskaSestra medicinskaSestra) {
		medSestraService.updateMedicinskaSestra(id, medicinskaSestra);
	}
	
	@RequestMapping(value="/medicinskaSestras/{id}", method=RequestMethod.DELETE)
	public void deleteMedicinskaSestra(@PathVariable Long id) {
		medSestraService.deleteMedicinskaSestra(id);
	}
	
}
