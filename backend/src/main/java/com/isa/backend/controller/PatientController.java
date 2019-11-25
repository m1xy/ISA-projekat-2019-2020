package com.isa.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isa.backend.service.PatientService;

@RestController
@RequestMapping(value = "api/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;
}
