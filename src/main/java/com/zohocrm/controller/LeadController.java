package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Leads;
import com.zohocrm.service.ContactService;
import com.zohocrm.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
@RequestMapping("/createLead")
	public String viewCreateLeadForm() {
		return "create_lead";
	}
@RequestMapping("/saveLead")
public String saveLead(@ModelAttribute ("leads")Leads leads, Model model) {
	leadService.saveOneLead(leads);
	model.addAttribute("leads", leads);
	return "lead_info";
}
@RequestMapping("/convertLead")
public String convertLead(@RequestParam("id") long id, Model model) {
Leads leads = leadService.getLeadsById(id);	

Contact contact = new Contact();
contact.setFirstName(leads.getFirstName());
contact.setLastName(leads.getLastName());
contact.setEmail(leads.getEmail());
contact.setMobile(leads.getMobile());
contact.setSource(leads.getSource());

contactService.saveContact(contact);

leadService.deleteLeadsById(id);

List<Contact> contacts = contactService.getContacts();
model.addAttribute("contacts", contacts);
return "list_contacts";

}

@RequestMapping("/listleads")
public String listLeads(Model model) {
	List<Leads> leads = leadService.getAllLeads();
	model.addAttribute("leads", leads);
	return "list_leads";
}
@RequestMapping("/leadInfo")
public String leadInfo(@RequestParam("id")long id, Model model) {
	Leads leads = leadService.getLeadsById(id);
	model.addAttribute("leads", leads);
	return "lead_info";
}
}
