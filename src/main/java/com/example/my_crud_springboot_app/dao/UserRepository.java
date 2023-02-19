package com.example.my_crud_springboot_app.dao;

import com.example.my_crud_springboot_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
