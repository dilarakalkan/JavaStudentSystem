package com.example.studentsystem.dto;

import java.time.LocalDateTime;

public class InternshipDTO {
    private Long id;
    private String title;
    private String company;
    private String field;
    private LocalDateTime applicationDate;

    public InternshipDTO() {
    }

    public InternshipDTO(Long id, String title, String company, String field, LocalDateTime applicationDate) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.field = field;
        this.applicationDate = applicationDate;
    }
}
