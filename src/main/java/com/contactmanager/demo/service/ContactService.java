package com.contactmanager.demo.service;

import com.contactmanager.demo.model.Contacts;
import com.contactmanager.demo.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public Contacts getContactById(int id) {
        return repo.findById(id).orElse(new Contacts());
    }


    public List<Contacts> getUserByName(String name) {
        return repo.findByContactNameStartingWithIgnoreCase(name);
    }

    @Transactional
    public void deleteByName(String name) {
        repo.deleteByContactName(name);
    }

    public void updateContact(Contacts contact) {
        repo.save(contact);
    }
}
