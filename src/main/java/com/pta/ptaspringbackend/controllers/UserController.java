package com.pta.ptaspringbackend.controllers;

import com.pta.ptaspringbackend.services.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices){
        this.userServices = userServices;
    }

    @GetMapping
    public String getAllUsers(Model model){
        model.addAttribute("users",userServices.getAllUsers());
        return "users";
    }

}
