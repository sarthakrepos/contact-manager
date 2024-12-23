package com.contactmanager.demo.controller;


import com.contactmanager.demo.model.Contacts;
import com.contactmanager.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ContactsController {

    @Autowired
    ContactService contactService;
    @GetMapping("/")
    public List<Contacts> getContacts(){
        return contactService.getContacts();
    }
    @GetMapping("contacts/{id}")
    public Contacts getcontactById(@PathVariable int id){
        return contactService.getContactById(id);
    }

    @GetMapping("/users/{name}")
    public List<Contacts> getUserByName(@PathVariable String name) {
        return contactService.getUserByName(name);

    }

    @PostMapping("/add-contact")
    public void addContact(@RequestBody Contacts contact){
        contactService.addContact(contact);
    }
}
