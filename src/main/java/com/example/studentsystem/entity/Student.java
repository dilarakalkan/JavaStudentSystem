package com.example.studentsystem.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity()
public class Student extends User {
    private String name;
    private String university;
    private String department;

}
