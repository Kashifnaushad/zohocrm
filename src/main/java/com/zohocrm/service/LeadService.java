package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Leads;

public interface LeadService {
public void saveOneLead(Leads leads);
public Leads getLeadsById(long id);
public void deleteLeadsById(long id);
public List<Leads> getAllLeads();
}
