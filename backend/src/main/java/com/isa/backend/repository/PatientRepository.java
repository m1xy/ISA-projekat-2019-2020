package com.isa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isa.backend.model.user.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
