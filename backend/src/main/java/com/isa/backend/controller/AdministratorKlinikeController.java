package com.isa.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.model.user.AdministratorKlinike;
import com.isa.backend.service.AdministratorKlinikeService;

@RestController
public class AdministratorKlinikeController {

	@Autowired
	private AdministratorKlinikeService adminKlinikeService;
	
	
	@RequestMapping("/hello/administratoKlinike")
	public String hi(){
		return "<div style='padding:25px;color:#fff;background:#333;text-align:center'><h1>Hello Admin Klinike!</h1></div>"; 
	}
	
	@RequestMapping("/administratorKlinikes")
	public List<AdministratorKlinike> getAllAdministratorKlinikes() {
		return adminKlinikeService.getAllAdministratorKlinikes();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/administratorKlinikes/{id}")
	public Optional<AdministratorKlinike> getAdministratorKlinike(@PathVariable Long id){
		return adminKlinikeService.getAdministratorKlinike(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/administratorKlinikes")
	public void addAdministratorKlinike(@RequestBody AdministratorKlinike adminKlinike) {
		adminKlinikeService.addAdministratorKlinike(adminKlinike);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/administratorKlinikes/{id}")
	public void updateAdministratorKlinike(@PathVariable Long id, @RequestBody AdministratorKlinike adminKlinike) {
		adminKlinikeService.updateAdministratorKlinike(id, adminKlinike);
	}
	
	@RequestMapping(value="/administratorKlinikes/{id}", method=RequestMethod.DELETE)
	public void deleteAdministratorKlinike(@PathVariable Long id) {
		adminKlinikeService.deleteAdministratorKlinike(id);
	}
	
}
