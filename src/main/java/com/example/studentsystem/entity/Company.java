package com.example.studentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "COMPANIES")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String description;


    //bir şirket ilanına birden fazla öğrenci başvuru yapabilir

    @ManyToMany(mappedBy = "companies")
    private List<Student> students;
}
