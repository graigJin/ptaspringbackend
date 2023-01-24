package com.pta.ptaspringbackend.controllers;

import com.pta.ptaspringbackend.services.PersonServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {

    private final PersonServices personServices;

    public PersonController(PersonServices personServices){
        this.personServices = personServices;
    }

    @GetMapping
    public String getAllPersons(Model model){
        model.addAttribute("persons",personServices.getAllPersons());
        return "persons";
    }
}
