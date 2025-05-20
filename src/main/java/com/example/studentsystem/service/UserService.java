package com.example.studentsystem.service;


import com.example.studentsystem.dto.UserDTO;
import com.example.studentsystem.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(UserDTO userDTO);
    User updateUser(Long id, UserDTO userDTO);

    Optional<User> deleteUser(Long id);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User getUserByEmail(String email);
    User saveUser(User user);

}
