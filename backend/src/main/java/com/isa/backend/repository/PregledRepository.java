package com.isa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isa.backend.model.clinic.Pregled;

public interface PregledRepository extends JpaRepository<Pregled,Long> {

}
