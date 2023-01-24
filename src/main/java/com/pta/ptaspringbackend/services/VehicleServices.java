package com.pta.ptaspringbackend.services;

import com.pta.ptaspringbackend.data.VehicleRepository;
import com.pta.ptaspringbackend.models.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleServices {
    private final VehicleRepository vehicleRepository;

    public VehicleServices(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
    }

}
