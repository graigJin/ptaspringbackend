package com.pta.ptaspringbackend.models;

import com.pta.ptaspringbackend.data.RelationshipId;
import jakarta.persistence.*;

@Entity
@IdClass(RelationshipId.class)
@Table(name="PERSON")
public class Person{

    @Id
    @Column(name="PERSON_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long person_id;

    @Column(name="FIRST_NAME")
    public String firstName;

    @Column(name="LAST_NAME")
    public String lastName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ADDRESS_ID")
    public long address_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CONTACT_NR")
    public long contact_nr;

    public Person(long person_id, String firstName, String lastName, long address_id, long contact_nr){
        this.person_id = person_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address_id = address_id;
        this.contact_nr = contact_nr;
    }

    public Person() {

    }

    public long getPerson_id() {
        return person_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getAddress() {
        return address_id;
    }

    public long getContactData() {
        return contact_nr;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(long address_id) {
        this.address_id = address_id;
    }

    public void setContactData(long contact_nr) {
        this.contact_nr = contact_nr;
    }
}
