package com.example.studentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    @Column(nullable = false)
    private double amount;
    private String status;
    @Column(nullable = false)
    private LocalDate date;
    @Column(length = 500)
    private String description;
}