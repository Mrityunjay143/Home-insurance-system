package com.mrityunjay.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrityunjay.restapi.entities.Property;

public interface PropertyDao extends JpaRepository<Property, Long> {

}
