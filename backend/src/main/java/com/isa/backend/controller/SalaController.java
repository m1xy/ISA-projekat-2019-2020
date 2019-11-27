package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.clinic.Sala;
import com.isa.backend.model.user.MedicinskaSestra;
import com.isa.backend.service.SalaService;

@RestController
public class SalaController {
	
	@Autowired
	private SalaService salaService;
	
	@RequestMapping("/hello/sala")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello!Trazili ste salu!</h1></div>"; 
	}
	
	@RequestMapping("/salas")
	public List<Sala> getAllSalas() {
		return salaService.getAllSalas();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/salas/{id}")
	public Optional<Sala> getSala(@PathVariable Long id){
		return salaService.getSala(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/salas")
	public void addSala(@RequestBody Sala sala) {
		salaService.addSala(sala);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/salas/{id}")
	public void updateSala(@PathVariable Long id, @RequestBody Sala sala) {
		salaService.updateSala(id, sala);
	}
	
	@RequestMapping(value="/salas/{id}", method=RequestMethod.DELETE)
	public void deleteSala(@PathVariable Long id) {
		salaService.deleteSala(id);
	}
	
}
