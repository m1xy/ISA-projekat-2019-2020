package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.clinic.Operacija;
import com.isa.backend.service.OperacijaService;

@RestController
public class OperacijaController {
	
	@Autowired
	private OperacijaService operacijaService;
	
	@RequestMapping("/hello/opercija")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello! Trazili ste operaciju!</h1></div>"; 
	}
	
	@RequestMapping("/operacijas")
	public List<Operacija> getAllOperacijas() {
		return operacijaService.getAllOperacijas();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/operacijas/{id}")
	public Optional<Operacija> getOperacija(@PathVariable Long id){
		return operacijaService.getOperacija(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/operacijas")
	public void addOperacija(@RequestBody Operacija operacija) {
		operacijaService.addOperacija(operacija);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/operacijas/{id}")
	public void updateOperacija(@PathVariable Long id, @RequestBody Operacija operacija) {
		operacijaService.updateOperacija(id, operacija);
	}
	
	@RequestMapping(value="/operacijas/{id}", method=RequestMethod.DELETE)
	public void deleteOperacija(@PathVariable Long id) {
		operacijaService.deleteOperacija(id);
	}
	
	
}
