package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.PaymentDTO;
import com.example.studentsystem.repository.PaymentRepository;
import com.example.studentsystem.service.PaymentService;

import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public List<PaymentDTO> getAllPayments() {
        return null;
    }

    @Override
    public PaymentDTO getPaymentById(Long id) {
        return null;
    }

    @Override
    public List<PaymentDTO> filterByStudentName(String studentName) {
        return null;
    }

    @Override
    public List<PaymentDTO> filterByStatus(String status) {
        return null;
    }

    @Override
    public PaymentDTO createPayment(PaymentDTO paymentDTO) {
        return null;
    }

    @Override
    public PaymentDTO updatePayment(Long id, PaymentDTO paymentDTO) {
        return null;
    }

    @Override
    public void deletePayment(Long id) {

    }
}