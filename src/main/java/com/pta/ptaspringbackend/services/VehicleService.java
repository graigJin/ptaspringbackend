package com.pta.ptaspringbackend.services;

import com.pta.ptaspringbackend.data.VehicleRepository;
import com.pta.ptaspringbackend.models.Person;
import com.pta.ptaspringbackend.models.Role;
import com.pta.ptaspringbackend.models.Vehicle;

import java.util.List;

public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllPersons(){
        return vehicleRepository.findAll();
    }

}
