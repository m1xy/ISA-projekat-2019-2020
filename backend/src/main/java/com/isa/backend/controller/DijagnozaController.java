package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.report.Dijagnoza;
import com.isa.backend.model.user.MedicinskaSestra;
import com.isa.backend.service.DijagnozaService;

@RestController
public class DijagnozaController {
		
	@Autowired
	private DijagnozaService dijagnozaService;
	
	@RequestMapping("/hello/dijagnoza")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello!Trazili ste dijagnozu!</h1></div>"; 
	}
	
	@RequestMapping("/dijagnozas")
	public List<Dijagnoza> getAllDijagnozas() {
		return dijagnozaService.getAllDijagnozas();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/dijagnozas/{id}")
	public Optional<Dijagnoza> getDijagnoza(@PathVariable Long id){
		return dijagnozaService.getDijagnoza(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/dijagnozas")
	public void addDijagnoza(@RequestBody Dijagnoza dijagnoza) {
		dijagnozaService.addDijagnoza(dijagnoza);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/dijagnozas/{id}")
	public void updateDijagnoza(@PathVariable Long id, @RequestBody Dijagnoza dijagnoza) {
		dijagnozaService.updateDijagnoza(id, dijagnoza);
	}
	
	@RequestMapping(value="/dijagnozas/{id}", method=RequestMethod.DELETE)
	public void deleteDijagnoza(@PathVariable Long id) {
		dijagnozaService.deleteDijagnoza(id);
	}
		
}
