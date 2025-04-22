package com.example.studentsystem.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String email;
    private String password;
    private boolean rememberMe;
}
