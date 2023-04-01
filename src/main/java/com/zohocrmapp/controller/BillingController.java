package com.zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.services.BillingService;
import com.zohocrmapp.services.ContactService;

@Controller
public class BillingController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generateBill")
	public String generateBill(@RequestParam("id") long id, Model model) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
	
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute("billing") Billing billing, Model model) {
		billingService.saveOneBill(billing);
		model.addAttribute("msg3", "Bill is generated check into Bill Table...");
		return "generate_bill";
	}
	
	//localhost:8080/zohocrmapp/listBills
	@RequestMapping("/listBills")
	public String listAllBills(Model model) {
		List<Billing> billing = billingService.getAllBills();
		model.addAttribute("billing", billing);
		return "list_bills";
		
	}
}
