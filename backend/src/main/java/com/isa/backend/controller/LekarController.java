package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.user.Lekar;
import com.isa.backend.service.LekarService;

@RestController
public class LekarController {

	
	@Autowired
	private LekarService lekarService;
	
	//Za tesitranje da li radi u browseru 
		@RequestMapping("/hello/lekar")
		public String hi(){
			return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello Lekaru!</h1></div>"; 
		}
		
		@RequestMapping("/lekars")
		public List<Lekar> getAllLekars() {
			return lekarService.getAllLekars();
		}
		
		@RequestMapping(method=RequestMethod.GET, value="/lekars/{id}")
		public Optional<Lekar> getLekar(@PathVariable Long id){
			return lekarService.getLekar(id);
		}
		
		//POST
		@RequestMapping(method=RequestMethod.POST, value="/lekars")
		public void addLekar(@RequestBody Lekar lekar) {
			lekarService.addLekar(lekar);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/lekars/{id}")
		public void updateLekar(@PathVariable Long id, @RequestBody Lekar lekar) {
			lekarService.updateLekar(id, lekar);
		}
		
		@RequestMapping(value="/lekars/{id}", method=RequestMethod.DELETE)
		public void deleteLekar(@PathVariable Long id) {
			lekarService.deleteLekar(id);
		}
}
