package com.example.userportal.repositories;

import com.example.userportal.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    void delete(User user);

}
