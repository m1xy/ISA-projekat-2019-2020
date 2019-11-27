package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.report.IzvestajPregleda;
import com.isa.backend.model.user.MedicinskaSestra;
import com.isa.backend.service.IzvestajPregledaService;

@RestController
public class IzvestajPregledaController {

	@Autowired
	private IzvestajPregledaService izvestajPregledaService;
	
	@RequestMapping("/hello/izvestajPregleda")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello!Traizili ste izvestaj pregleda!</h1></div>"; 
	}
	
	@RequestMapping("/izvestajPregledas")
	public List<IzvestajPregleda> getAllIzvestajPregledas() {
		return izvestajPregledaService.getAllIzvestajPregledas();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/izvestajPregledas/{id}")
	public Optional<IzvestajPregleda> getIzvestajPregleda(@PathVariable Long id){
		return izvestajPregledaService.getIzvestajPregleda(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/izvestajPregledas")
	public void addIzvestajPregleda(@RequestBody IzvestajPregleda izvestajPregleda) {
		izvestajPregledaService.addIzvestajPregleda(izvestajPregleda);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/izvestajPregledas/{id}")
	public void updateIzvestajPregleda(@PathVariable Long id, @RequestBody IzvestajPregleda izvestajPregleda) {
		izvestajPregledaService.updateIzvestajPregleda(id, izvestajPregleda);
	}
	
	@RequestMapping(value="/izvestajPregledas/{id}", method=RequestMethod.DELETE)
	public void deleteIzvestajPregleda(@PathVariable Long id) {
		izvestajPregledaService.deleteIzvestajPregleda(id);
	}
}
