package com.pta.ptaspringbackend.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Address {

    @Setter
    @Getter
    private long id;
    public String street;
    public String number;
    public String zipcode;
    public String city;
    public String country;

    public Address(String street, String number, String zipcode, String city, String country){
        this.street = street;
        this.number = number;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
    }
    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
