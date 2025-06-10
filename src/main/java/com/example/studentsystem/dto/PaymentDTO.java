package com.example.studentsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter

public class PaymentDTO {
    private Long id;
    private String studentName;
    private double amount;
    private String status;
    private LocalDate date;
    private String description;

}
