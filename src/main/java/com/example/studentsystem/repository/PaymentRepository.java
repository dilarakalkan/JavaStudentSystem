package com.example.studentsystem.repository;


import com.example.studentsystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    List<Payment> findByStudentName(String studentName);
    List<Payment> findByStatus(String status);
}
