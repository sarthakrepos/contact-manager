package com.contactmanager.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Contacts {

    @Id
    private int id;
    private long contactNo;
    private String contactName;

    public Contacts() {
    }

    public Contacts(int id, long contactNo, String contactName) {
        this.id = id;
        this.contactNo = contactNo;
        this.contactName = contactName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", contactNo=" + contactNo +
                ", contactName='" + contactName + '\'' +
                '}';
    }
}
