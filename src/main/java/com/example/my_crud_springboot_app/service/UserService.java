package com.example.my_crud_springboot_app.service;

import com.example.my_crud_springboot_app.model.User;

import java.util.List;

public interface UserService {

    List<User> showAllUsers();

    User showUser(int id);

    void saveUser(User user);

    void updateUser(int id, User updatedUser);

    void deleteUser(int id);
}
