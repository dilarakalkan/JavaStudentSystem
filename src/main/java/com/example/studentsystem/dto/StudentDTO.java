package com.example.studentsystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
    private Long id;
    private String university;
    private String department;
    private String studentNumber;

    public StudentDTO(Long id, String university, String department, String studentNumber) {
        this.id = id;
        this.university = university;
        this.department = department;
        this.studentNumber = studentNumber;
    }
}
