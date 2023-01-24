package com.pta.ptaspringbackend.data;

import com.pta.ptaspringbackend.models.Person;
import com.pta.ptaspringbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
