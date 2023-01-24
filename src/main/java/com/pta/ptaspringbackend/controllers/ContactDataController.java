package com.pta.ptaspringbackend.controllers;

import com.pta.ptaspringbackend.services.ContactDataServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("contacts")
public class ContactDataController {

    private final ContactDataServices contactDataServices;

    public ContactDataController(ContactDataServices contactDataServices) {
        this.contactDataServices = contactDataServices;
    }


    @GetMapping
    public String getAllContacts(Model model){
        model.addAttribute("contacts", contactDataServices.getAllContactData());
        return "contacts";
    }
}
