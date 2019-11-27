package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.clinic.Pregled;
import com.isa.backend.model.user.MedicinskaSestra;
import com.isa.backend.service.PregledService;

@RestController
public class PregledController {

	@Autowired
	private PregledService pregledService;
	
	@RequestMapping("/hello/pregled")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello! Trazili ste pregled!</h1></div>"; 
	}
	
	@RequestMapping("/pregleds")
	public List<Pregled> getAllPregleds() {
		return pregledService.getAllPregleds();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/pregleds/{id}")
	public Optional<Pregled> getPregled(@PathVariable Long id){
		return pregledService.getPregled(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/pregleds")
	public void addPregled(@RequestBody Pregled pregled) {
		pregledService.addPregled(pregled);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/pregleds/{id}")
	public void updatePregled(@PathVariable Long id, @RequestBody Pregled pregled) {
		pregledService.updatePregled(id, pregled);
	}
	
	@RequestMapping(value="/pregleds/{id}", method=RequestMethod.DELETE)
	public void deletePregled(@PathVariable Long id) {
		pregledService.deletePregled(id);
	}
	
}
