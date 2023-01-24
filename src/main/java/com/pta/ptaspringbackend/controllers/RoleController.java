package com.pta.ptaspringbackend.controllers;

import com.pta.ptaspringbackend.services.RoleServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoleController {

    private RoleServices roleServices;

    public RoleController(RoleServices roleServices){
        this.roleServices = roleServices;
    }

    @GetMapping
    public String getAllRoles(Model model){
        model.addAttribute("roles",roleServices.getAllRoles());
        return "roles";
    }
}
