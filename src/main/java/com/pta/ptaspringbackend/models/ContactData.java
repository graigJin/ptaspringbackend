package com.pta.ptaspringbackend.models;

import jakarta.persistence.*;

@Entity
@Table(name="CONTACT_DATA")
public class ContactData {

    @Id
    @Column(name="CONTACT_NR")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="EMAIL")
    public String email;
    @Column(name="PHONE")
    private String phone;


    public ContactData(String phone, String email) {
        this.email = email;
        this.phone = phone;
    }

    public ContactData() {

    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
