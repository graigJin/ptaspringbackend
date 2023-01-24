package com.pta.ptaspringbackend.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name="USER_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long id;
    @Column(name = "PERSON_ID")
    public long personId;
    @Column(name = "ROLE_ID")
    public Role role;

    @Column(name="WORKSHOP_ID")
    public String workshopId;

    public User(){

    }

    public User(long id, long personId, Role role, String workshopId) {
        this.id = id;
        this.personId = personId;
        this.role = role;
        this.workshopId = workshopId;
    }

    public long getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }



    public long getPersonId() {
        return personId;
    }

    public String getWorkshop() {
        return workshopId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setWorkshop(String workshopId) {
        this.workshopId = workshopId;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
