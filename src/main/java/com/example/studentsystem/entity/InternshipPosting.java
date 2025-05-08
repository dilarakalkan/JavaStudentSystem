package com.example.studentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

//şirketin açtığı ilan

@Getter
@Setter

@Entity
public class InternshipPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String description;
        public LocalDate startDate;
        private LocalDate endDate;

        @ManyToOne
        private Company company;
        {
    }
}


