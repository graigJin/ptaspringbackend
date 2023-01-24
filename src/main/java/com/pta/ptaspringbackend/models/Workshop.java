package com.pta.ptaspringbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class Workshop {

     private long id;
     public  Address address;
     public User user;
     public User user_admin;
     public User user_mod;

     public Workshop(Address address, User user, User user_admin, User user_mod){
         this.address = address;
         this.user = user;
         this.user_admin = user_admin;
         this.user_mod = user_mod;
     }

    public long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public String getUser(User user){
         Role role = user.getRole();
         return role.toString();
         }
}
