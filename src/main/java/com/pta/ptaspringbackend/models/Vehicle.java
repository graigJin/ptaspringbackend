package com.pta.ptaspringbackend.models;

import jakarta.persistence.*;

@Entity
@Table(name="VEHICLE")
public class Vehicle {

    @Id
    @Column(name="VEHICLE_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="PERSON_ID")
    public String owner;

    @Column(name="MODEL")
    public String model;

    @Column(name="BRAND")
    public String brand;

    @Column(name="LICENCE_NR")
    public String licencePlate;

    public Vehicle (String owner, String model, String brand, String licencePlate){
        this.owner = owner;
        this.model = model;
        this.brand = brand;
        this.licencePlate = licencePlate;
    }

    public Vehicle() {

    }

    public long getId() {
        return id;
    }

    public String getOwner(){
        return owner;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
