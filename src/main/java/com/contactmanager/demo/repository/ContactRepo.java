package com.contactmanager.demo.repository;

import com.contactmanager.demo.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ContactRepo extends JpaRepository<Contacts,Integer> {
    List<Contacts> findByContactNameStartingWithIgnoreCase(String contactName);

    void deleteByContactName(String contactName);
}
