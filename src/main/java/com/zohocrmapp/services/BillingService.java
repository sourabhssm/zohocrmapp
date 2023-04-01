package com.zohocrmapp.services;

import java.util.List;

import com.zohocrmapp.entities.Billing;

public interface BillingService {

	void saveOneBill(Billing billing);

	List<Billing> getAllBills();
	
}
