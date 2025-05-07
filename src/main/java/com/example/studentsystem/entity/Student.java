package com.example.studentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String university;
    private String department;
    private String email;
    private String password;


    // Çoktan çoğa ilişki
    @ManyToMany
    @JoinTable(
            name = "student_company",
            joinColumns = @JoinColumn(name = "student_id"),  //  dış anahtar
            inverseJoinColumns = @JoinColumn(name = "company_id")  // Bu, company tablosundaki dış anahtar
    )
    private List<Company> companies;  // Öğrencinin başvurduğu şirketler
}
