package com.example.studentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="STUDENT_NAME")
    private String studentName;
    @Column(name="AMOUNT")
    private double amount;
    @Column(name="STATUS")
    private String status;
    @Column(name="DATE")
    private LocalDate date;
    @Column(name="DESCRİPTİON")
    private String description;
}