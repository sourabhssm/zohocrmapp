package com.zohocrmapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.dto.LeadDto;
import com.zohocrmapp.entities.Lead;
import com.zohocrmapp.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepository;
	
	@Override
	public void saveOneLead(Lead lead) {
		leadRepository.save(lead);
	}

	@Override
	public Lead findLeadById(long id) {
		Lead lead = leadRepository.findById(id).get();
		return lead;
	}

	@Override
	public void deleteLeadById(long id) {
		leadRepository.deleteById(id);
	}

	@Override
	public List<Lead> getAllLeads() {
		return leadRepository.findAll();
	}

}
