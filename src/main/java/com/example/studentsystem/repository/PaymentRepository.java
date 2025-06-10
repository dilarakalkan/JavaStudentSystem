package com.example.studentsystem.repository;


import com.example.studentsystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
    List<Payment> findByStudentName(String studentName);
    List<Payment> findByStatus(String status);
}
