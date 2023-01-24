package com.pta.ptaspringbackend.services;

import com.pta.ptaspringbackend.data.ContactDataRepository;
import com.pta.ptaspringbackend.models.ContactData;
import com.pta.ptaspringbackend.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ContactDataServices {

    private final ContactDataRepository contactDataRepository;

    public ContactDataServices(ContactDataRepository contactDataRepository) {
        this.contactDataRepository = contactDataRepository;
    }

    public List<ContactData> getAllContactData(){
        return contactDataRepository.findAll();
    }
}
