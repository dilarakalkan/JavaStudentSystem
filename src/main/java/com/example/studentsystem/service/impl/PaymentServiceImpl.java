package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.PaymentDTO;
import com.example.studentsystem.entity.Payment;
import com.example.studentsystem.repository.PaymentRepository;
import com.example.studentsystem.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    // DTO dönüşümü - tek merkezli
    private PaymentDTO convertToDto(Payment payment) {
        return new PaymentDTO(
                payment.getId(),
                payment.getStudentName(),
                payment.getAmount(),
                payment.getStatus(),
                payment.getDate(),
                payment.getDescription()
        );
    }

    @Override
    public List<PaymentDTO> filterByStudentName(String studentName) {
        return paymentRepository.findByStudentName(studentName)
                .stream()
                .map(this::convertToDto) // convertToDto kullanılıyor
                .collect(Collectors.toList());
    }

    @Override
    public List<PaymentDTO> getAllPayments() {
        return paymentRepository.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public PaymentDTO getPaymentById(Long id) {
        Optional<Payment> payment = paymentRepository.findById(id);
        return payment.map(this::convertToDto)
                .orElse(null); // veya exception fırlatılabilir????
    }

    @Override
    public List<PaymentDTO> filterByStatus(String status) {
        return paymentRepository.findByStatus(status)
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
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