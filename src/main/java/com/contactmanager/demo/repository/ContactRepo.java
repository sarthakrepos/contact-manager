package com.contactmanager.demo.repository;

import com.contactmanager.demo.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contacts,Integer> {
}
