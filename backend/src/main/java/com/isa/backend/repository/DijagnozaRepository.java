package com.isa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isa.backend.model.report.Dijagnoza;

public interface DijagnozaRepository extends JpaRepository<Dijagnoza, Long> {
	
}
