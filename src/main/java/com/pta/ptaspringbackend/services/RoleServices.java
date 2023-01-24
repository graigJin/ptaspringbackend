package com.pta.ptaspringbackend.services;

import com.pta.ptaspringbackend.models.Role;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RoleServices {
    private static final List<Role> roles = new ArrayList();

    public List<Role> getAllRoles(){
        return roles;
    }
}
