package com.pta.ptaspringbackend.data;

import com.pta.ptaspringbackend.models.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;

import java.io.Serializable;


public class RelationshipId implements Serializable {

    private Long person_id;
    private Long address_id;
    private Long contact_nr;

    public RelationshipId(Long personId, Long addressId, Long contactNr) {
        person_id = personId;
        address_id = addressId;
        contact_nr = contactNr;
    }

    public RelationshipId() {
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 0;
        return result;
    }


}
