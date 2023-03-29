package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.service.BillingService;
import com.zohocrm.service.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/createBill")
public String createBill(@RequestParam("id")long id, Model model) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return"generate_bill";
	
}
	@RequestMapping("/saveBill")
	public String saveBill(Billing bill, Model model) {
		billingService.generateBill(bill);
		List<Billing> bills = billingService.getAllBill();
		model.addAttribute("bills", bills);
		return "list_bills";
		
		
		
	}
	@RequestMapping("/allBills")
public String ListAllBill(Model model) {
	List<Billing> bills = billingService.getAllBill();
	model.addAttribute("bills", bills);
	return "list_bills";
}

}
