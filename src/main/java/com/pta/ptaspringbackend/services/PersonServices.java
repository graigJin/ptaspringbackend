package com.pta.ptaspringbackend.services;

import com.pta.ptaspringbackend.data.PersonRepository;
import com.pta.ptaspringbackend.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServices {

    private final PersonRepository personRepository;

    public PersonServices(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }


}
