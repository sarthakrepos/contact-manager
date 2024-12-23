package com.contactmanager.demo.repository;

import com.contactmanager.demo.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ContactRepo extends JpaRepository<Contacts,Integer> {
//    @Query("SELECT u FROM Contacts u WHERE u.contactName = :name")
    List<Contacts> findByContactNameStartingWithIgnoreCase(String contactName);
}
