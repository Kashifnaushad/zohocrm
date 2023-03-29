package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Leads;

public interface LeadRepository extends JpaRepository<Leads, Long> {

}
