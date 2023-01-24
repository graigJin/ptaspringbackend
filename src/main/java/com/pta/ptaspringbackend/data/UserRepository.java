package com.pta.ptaspringbackend.data;

import com.pta.ptaspringbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
