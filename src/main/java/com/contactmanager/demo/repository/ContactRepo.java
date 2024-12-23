package com.contactmanager.demo.repository;

import com.contactmanager.demo.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ContactRepo extends JpaRepository<Contacts,Integer> {
    List<Contacts> findByContactNameStartingWithIgnoreCase(String contactName);
}
