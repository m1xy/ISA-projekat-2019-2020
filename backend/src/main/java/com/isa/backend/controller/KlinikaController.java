package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.clinic.Klinika;
import com.isa.backend.model.user.MedicinskaSestra;
import com.isa.backend.service.KlinikaService;

@RestController
public class KlinikaController {
	
	@Autowired
	private KlinikaService klinikaService;
	
	@RequestMapping("/hello/klinika")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello! Trazili ste kliniku!</h1></div>"; 
	}
	
	@RequestMapping("/klinikas")
	public List<Klinika> getAllKlinikas() {
		return klinikaService.getAllKlinikas();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/klinikas/{id}")
	public Optional<Klinika> getKlinika(@PathVariable Long id){
		return klinikaService.getKlinika(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/klinikas")
	public void addKlinika(@RequestBody Klinika klinika) {
		klinikaService.addKlinika(klinika);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/klinikas/{id}")
	public void updateKlinika(@PathVariable Long id, @RequestBody Klinika klinika) {
		klinikaService.updateKlinika(id, klinika);
	}
	
	@RequestMapping(value="/klinikas/{id}", method=RequestMethod.DELETE)
	public void deleteKlinika(@PathVariable Long id) {
		klinikaService.deleteKlinika(id);
	}
	

}
