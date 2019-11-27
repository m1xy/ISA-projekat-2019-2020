package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.report.ZdravstveniKarton;
import com.isa.backend.model.user.MedicinskaSestra;
import com.isa.backend.service.ZdravstveniKartonService;

@RestController
public class ZdravstveniKartonController {

	@Autowired
	private ZdravstveniKartonService zdravstveniKartonService;
	
	@RequestMapping("/hello/zdravstevniKarton")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello! Trazili ste zdravstveni karton!</h1></div>"; 
	}
	
	@RequestMapping("/zdravstveniKartons")
	public List<ZdravstveniKarton> getAllZdravstveniKartons() {
		return zdravstveniKartonService.getAllZdravstveniKartons();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/zdravstveniKartons/{id}")
	public Optional<ZdravstveniKarton> getZdravstveniKarton(@PathVariable Long id){
		return zdravstveniKartonService.getZdravstveniKarton(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/zdravstveniKartons")
	public void addZdravstveniKarton(@RequestBody ZdravstveniKarton zdavstveniKarton) {
		zdravstveniKartonService.addZdravstveniKarton(zdavstveniKarton);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/zdravstveniKartons/{id}")
	public void updateZdravstveniKarton(@PathVariable Long id, @RequestBody ZdravstveniKarton zdavstveniKarton) {
		zdravstveniKartonService.updateZdravstveniKarton(id, zdavstveniKarton);
	}
	
	@RequestMapping(value="/zdravstveniKartons/{id}", method=RequestMethod.DELETE)
	public void deleteZdravstveniKarton(@PathVariable Long id) {
		zdravstveniKartonService.deleteZdravstveniKarton(id);
	}
}
