package com.example.studentsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter

public class InternshipPostingDTO {
    private Long id;
    private String title;
    private String company;
    private String field;
    private String description;
    private LocalDateTime applicationDate;

    public InternshipPostingDTO() {
    }

    // constructor gerek var mı
    public InternshipPostingDTO(Long id, String title, String company, String field, String description, LocalDateTime applicationDate) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.field = field;
        this.description = description;
        this.applicationDate = applicationDate;
    }


}
