package com.example.studentsystem.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentDTO {
    private Long id;
    private String studentNumber;
    private String university;
    private String department;
    private UserDTO user;
}
