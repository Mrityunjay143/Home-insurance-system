package com.mrityunjay.restapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrityunjay.restapi.entities.Quotation;

public interface QuotationDao extends JpaRepository<Quotation, Long> {
	List<Quotation> findByUsername(String username);
}
