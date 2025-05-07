package com.example.studentsystem.service;

import com.example.studentsystem.dto.PaymentDTO;
import org.springframework.stereotype.Service;

import java.util.List;




public interface PaymentService {
    List<PaymentDTO> getAllPayments();

    PaymentDTO getPaymentById(Long id);

    List<PaymentDTO> filterByStudentName(String studentName);

    List<PaymentDTO> filterByStatus(String status);
    // Yeni ödeme eklemek için metod
    PaymentDTO createPayment(PaymentDTO paymentDTO);

    // Ödemeyi güncellemek için metod
    PaymentDTO updatePayment(Long id, PaymentDTO paymentDTO);


    void deletePayment(Long id);
}
