package com.example.studentsystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
    private Long id;
    private String name;
    private String university;
    private String department;
    public StudentDTO(Long id,String name,String university,String Department){
        this.id=id;
        this.name=name;
        this.university=university;
        this.department=department;
    }

}
