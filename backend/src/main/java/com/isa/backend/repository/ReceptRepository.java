package com.isa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isa.backend.model.report.Recept;

public interface ReceptRepository extends JpaRepository<Recept, Long>{
	
}
