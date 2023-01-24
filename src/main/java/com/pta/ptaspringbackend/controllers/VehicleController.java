package com.pta.ptaspringbackend.controllers;

import com.pta.ptaspringbackend.services.VehicleServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {

    private final VehicleServices vehicleServices;

    public VehicleController(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    @GetMapping
    public String getAllVehicles(Model model){
        model.addAttribute("vehicles",vehicleServices.getAllVehicles());
        return "vehicles";
    }
}
