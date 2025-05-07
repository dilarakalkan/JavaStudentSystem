package com.example.studentsystem.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
//öğrencinin başvuru yaptığı ilanı temsil eder.

public class InternshipApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime applicationDate;
    @ManyToOne
    private Student student;
    @ManyToOne
    private InternshipPosting posting;
    private String status;
}
