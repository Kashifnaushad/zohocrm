package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Leads;
import com.zohocrm.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService{
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveOneLead(Leads leads) {
leadRepo.save(leads);		
	}

	

	@Override
	public Leads getLeadsById(long id) {
		Optional<Leads> findById = leadRepo.findById(id);
		Leads leads = findById.get();
		return leads;
	}



	@Override
	public void deleteLeadsById(long id) {
		leadRepo.deleteById(id);
	}



	@Override
	public List<Leads> getAllLeads() {
List<Leads> leads = leadRepo.findAll();
		return leads;
	}

}
