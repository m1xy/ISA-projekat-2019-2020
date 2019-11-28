package com.isa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isa.backend.model.clinic.Operacija;

public interface OperacijaRepository extends  JpaRepository<Operacija,Long>{

}
