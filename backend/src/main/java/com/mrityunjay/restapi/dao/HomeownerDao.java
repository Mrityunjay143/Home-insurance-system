package com.mrityunjay.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrityunjay.restapi.entities.Homeowner;

public interface HomeownerDao extends JpaRepository<Homeowner, Long> {

}
