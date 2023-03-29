package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;

public interface BillingService {
	public void generateBill(Billing bill);

	public List<Billing> getAllBill();
	

}
