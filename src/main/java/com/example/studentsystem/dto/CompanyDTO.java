package com.example.studentsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CompanyDTO {
    private Long id;
    private String companyName;
    private String sector;
    private String location;



}
