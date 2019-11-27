package com.isa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isa.backend.model.report.IzvestajPregleda;

public interface IzvestajPregledaRepository extends JpaRepository<IzvestajPregleda, Long> {

}
