package com.mrityunjay.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrityunjay.restapi.entities.Location;

public interface LocationDao extends JpaRepository<Location, Long> {

}
