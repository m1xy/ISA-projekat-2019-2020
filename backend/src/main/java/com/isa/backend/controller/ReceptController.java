package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.report.Recept;
import com.isa.backend.service.ReceptService;

@RestController
public class ReceptController {

	@Autowired
	private ReceptService receptService;
	
	@RequestMapping("/hello/recept")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello! Trazili ste recept!</h1></div>"; 
	}
	
	@RequestMapping("/recepts")
	public List<Recept> getAllRecepts() {
		return receptService.getAllRecepts();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/recepts/{id}")
	public Optional<Recept> getRecept(@PathVariable Long id){
		return receptService.getRecept(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/recepts")
	public void addRecept(@RequestBody Recept recept) {
		receptService.addRecept(recept);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/recepts/{id}")
	public void updateRecept(@PathVariable Long id, @RequestBody Recept recept) {
		receptService.updateRecept(id, recept);
	}
	
	@RequestMapping(value="/recepts/{id}", method=RequestMethod.DELETE)
	public void deleteRecept(@PathVariable Long id) {
		receptService.deleteRecept(id);
	}
}
