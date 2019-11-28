package com.isa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isa.backend.model.clinic.Klinika;

public interface KlinikaRepository extends JpaRepository<Klinika,Long> {

}
