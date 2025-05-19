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


public PaymentDTO(Long id,String studentName,double amount,String status,LocalDate date,String description){
    this.id=id;
    this.studentName=studentName;
    this.amount=amount;
    this.status=status;
    this.date=date;
    this.description=description;

}
}
