package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.report.Lek;
import com.isa.backend.service.LekService;

@RestController
public class LekController {

	@Autowired
	private LekService lekService;
	
	@RequestMapping("/hello/lek")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello!Trazili ste lek!</h1></div>"; 
	}
	
	@RequestMapping("/leks")
	public List<Lek> getAllLeks() {
		return lekService.getAllLeks();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/leks/{id}")
	public Optional<Lek> getLek(@PathVariable Long id){
		return lekService.getLek(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/leks")
	public void addLek(@RequestBody Lek lek) {
		lekService.addLek(lek);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/leks/{id}")
	public void updateLek(@PathVariable Long id, @RequestBody Lek lek) {
		lekService.updateLek(id, lek);
	}
	
	@RequestMapping(value="/leks/{id}", method=RequestMethod.DELETE)
	public void deleteLek(@PathVariable Long id) {
		lekService.deleteLek(id);
	}
	
}
