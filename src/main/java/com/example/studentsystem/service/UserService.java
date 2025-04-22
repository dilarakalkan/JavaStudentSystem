package com.example.studentsystem.service;

import com.example.studentsystem.entity.User;
import com.example.studentsystem.dto.UserDTO;
import org.springframework.stereotype.Service;
import java.util.List;

//@service ekleme


public interface UserService {
    List<UserDTO> getAllUsers();

    UserDTO getUserById(Long id);

    List<UserDTO> filterStudentNumber(String studentNumber);

    List<UserDTO> filterByPassword(String password);

    void createUser(UserDTO userDTO);

    void updateUser(Long id, UserDTO userDTO);

    void deleteUser(Long id);

    User findByEmail(String email);

    boolean validateUser(UserDTO userDTO);

    User registerUser(User user);
}
