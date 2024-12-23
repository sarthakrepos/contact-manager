package com.contactmanager.demo.service;

import com.contactmanager.demo.model.Contacts;
import com.contactmanager.demo.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    ContactRepo repo;

    public List<Contacts> getContacts() {
        return repo.findAll();
    }

    public void addContact(Contacts contact) {
        repo.save(contact);
    }
}
