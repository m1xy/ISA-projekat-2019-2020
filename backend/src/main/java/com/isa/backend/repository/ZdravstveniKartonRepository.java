package com.isa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isa.backend.model.report.ZdravstveniKarton;

public interface ZdravstveniKartonRepository extends  JpaRepository<ZdravstveniKarton, Long> {

}
