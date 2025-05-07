package com.example.studentsystem.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "COMPANIES")
public class Company extends User {

    private String companyName;
    private String sector;
    private String location;

    @OneToMany(mappedBy = "company")
    private List<Student> students;
}
