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



}
