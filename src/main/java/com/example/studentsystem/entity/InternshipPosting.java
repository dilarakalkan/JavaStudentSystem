package com.example.studentsystem.entity;

//şirketin açtığı ilan
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "internship_postings")
public class InternshipPosting {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;

    private String description;

    private String requirements;
    private String location;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private LocalDateTime applicationDeadline;

    private String internshipStatus;

}


