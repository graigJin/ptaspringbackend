package com.pta.ptaspringbackend.models;

public class Vehicle {

    private long id;
    public Person owner;
    public String model;
    public String brand;
    public String licencePlate;

    public Vehicle (Person owner, String model, String brand, String licencePlate){
        this.owner = owner;
        this.model = model;
        this.brand = brand;
        this.licencePlate = licencePlate;
    }

    public long getId() {
        return id;
    }

    public Person getOwner(){
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

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
