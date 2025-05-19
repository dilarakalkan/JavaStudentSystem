package com.example.studentsystem.service;
import com.example.studentsystem.dto.PaymentDTO;
import java.util.List;

public interface PaymentService {
    List<PaymentDTO> getAllPayments();

    PaymentDTO getPaymentById(Long id);

    List<PaymentDTO> filterByStudentName(String studentName);

    List<PaymentDTO> filterByStatus(String status);
    PaymentDTO createPayment(PaymentDTO paymentDTO);

    PaymentDTO updatePayment(Long id, PaymentDTO paymentDTO);
    void deletePayment(Long id);
}
