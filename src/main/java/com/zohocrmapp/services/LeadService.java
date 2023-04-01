package com.zohocrmapp.services;

import java.util.List;

import com.zohocrmapp.entities.Lead;

public interface LeadService {

	void saveOneLead(Lead lead);

	Lead findLeadById(long id);

	void deleteLeadById(long id);

	List<Lead> getAllLeads();
		
}
