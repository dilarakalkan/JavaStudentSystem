package com.example.studentsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "internship_posting")
public class InternshipPosting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TİTLE")
    private String title;
    @Column(name="DESCRİPTİON")
    private String description;
    @Column(name="LOCATİON")
    private String location;
    @Column(name="WORK_TYPE")
    private String workType;
    @Column(name="APPLICATION_DEADLINE")
    private LocalDate applicationDeadline;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @OneToMany(mappedBy = "internshipPosting", cascade = CascadeType.ALL)
    private List<InternshipApplication> applications;

    }

