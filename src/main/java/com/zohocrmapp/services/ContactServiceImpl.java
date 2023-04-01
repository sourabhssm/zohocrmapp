package com.zohocrmapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public void saveContact(Contact contact) {
		contactRepository.save(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
		return contactRepository.findAll();
	}

	@Override
	public Contact findContactById(long id) {
		Contact contact = contactRepository.findById(id).get();
		return contact;
	}

	@Override
	public Contact getContactById(long id) {
		return contactRepository.findById(id).get();
	}

}
