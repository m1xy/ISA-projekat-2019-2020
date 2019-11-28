package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.user.AdministratorKlinickogCentra;
import com.isa.backend.model.user.MedicinskaSestra;
import com.isa.backend.service.AdministratorKlinickogCentraService;

@RestController
public class AdministratorKlinickogCentraController {

	@Autowired
	private AdministratorKlinickogCentraService adminKlinCentraService;
	
	//Za tesitranje da li radi u browseru 
		@RequestMapping("/hello/administratorKlinickogCentra")
		public String hi(){
			return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello Admin Klinickog Centra!</h1></div>"; 
		}
		
		@RequestMapping("/admininstratorKlinickogCentras")
		public List<AdministratorKlinickogCentra> getAllAdministratorKlinickogCentras() {
			return adminKlinCentraService.getAllAdministratorKlinickogCentras();
		}
		
		@RequestMapping(method=RequestMethod.GET, value="/admininstratorKlinickogCentras/{id}")
		public Optional<AdministratorKlinickogCentra> getAdministratorKlinickogCentra(@PathVariable Long id){
			return adminKlinCentraService.getAdministratorKlinickogCentra(id);
		}
		
		//POST
		@RequestMapping(method=RequestMethod.POST, value="/admininstratorKlinickogCentras")
		public void addAdministratorKlinickogCentra(@RequestBody AdministratorKlinickogCentra adminKlinCentra) {
			adminKlinCentraService.addAdministratorKlinickogCentra(adminKlinCentra);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/admininstratorKlinickogCentras/{id}")
		public void updateMedicinskaSestra(@PathVariable Long id, @RequestBody AdministratorKlinickogCentra adminKlinCentra) {
			adminKlinCentraService.updateAdministratorKlinickogCentra(id, adminKlinCentra);
		}
		
		@RequestMapping(value="/admininstratorKlinickogCentras/{id}", method=RequestMethod.DELETE)
		public void deleteAdministratorKlinickogCentra(@PathVariable Long id) {
			adminKlinCentraService.deleteAdministratorKlinickogCentra(id);
		}
}
