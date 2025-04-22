package com.example.studentsystem.service;

import com.example.studentsystem.dto.PaymentDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public interface PaymentService {
    List<PaymentDTO> getAllPayments();

    PaymentDTO getPaymentById(Long id);

    List<PaymentDTO> filterByStudentName(String studentName);

    List<PaymentDTO> filterByStatus(String status);


}
