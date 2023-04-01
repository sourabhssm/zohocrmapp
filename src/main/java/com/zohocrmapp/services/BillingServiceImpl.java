package com.zohocrmapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	private BillingRepository billingRepository;

	public BillingServiceImpl(BillingRepository billingRepository) {
		this.billingRepository = billingRepository;
	}

	@Override
	public void saveOneBill(Billing billing) {
		billingRepository.save(billing);
	}

	@Override
	public List<Billing> getAllBills() {
		return billingRepository.findAll();
		
	}

}
