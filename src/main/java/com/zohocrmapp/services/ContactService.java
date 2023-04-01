package com.zohocrmapp.services;

import java.util.List;

import com.zohocrmapp.entities.Contact;

public interface ContactService {
	
	public void saveContact(Contact contact);

	List<Contact> getAllContacts();

	Contact findContactById(long id);

	Contact getContactById(long id);
}
