package com.pta.ptaspringbackend.data;
import com.pta.ptaspringbackend.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
}
