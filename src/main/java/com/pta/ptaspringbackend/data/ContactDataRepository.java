package com.pta.ptaspringbackend.data;

import com.pta.ptaspringbackend.models.ContactData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDataRepository extends JpaRepository<ContactData,Long> {
}
