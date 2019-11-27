package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.clinic.TipPregleda;
import com.isa.backend.service.TipPregledaService;

@RestController
public class TipPregledaController {

	@Autowired
	private TipPregledaService tipPregledaService;
	
	//Za tesitranje da li radi u browseru 
		@RequestMapping("/hello/tipPregleda")
		public String hi(){
			return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello! Odabrali ste tip pregleda!</h1></div>"; 
		}
		
		@RequestMapping("/tipPregledaServices")
		public List<TipPregleda> getAllTipPregledas() {
			return tipPregledaService.getAllTipPregledas();
		}
		
		@RequestMapping(method=RequestMethod.GET, value="/tipPregledaServices/{id}")
		public Optional<TipPregleda> getTipPregleda(@PathVariable Long id){
			return tipPregledaService.getTipPregleda(id);
		}
		
		//POST
		@RequestMapping(method=RequestMethod.POST, value="/tipPregledaServices")
		public void addTipPregleda(@RequestBody TipPregleda tipPregleda) {
			tipPregledaService.addTipPregleda(tipPregleda);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/tipPregledaServices/{id}")
		public void updateTipPregleda(@PathVariable Long id, @RequestBody TipPregleda tipPregleda) {
			tipPregledaService.updateTipPregleda(id, tipPregleda);
		}
		
		@RequestMapping(value="/tipPregledaServices/{id}", method=RequestMethod.DELETE)
		public void deleteTipPregleda(@PathVariable Long id) {
			tipPregledaService.deleteTipPregleda(id);
		}
	
}
