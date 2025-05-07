package com.example.studentsystem.controller;

import com.example.studentsystem.dto.PaymentDTO;
import com.example.studentsystem.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    private final PaymentService paymentService;

    // Constructor injection ile PaymentService enjekte ediyoruz
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    //tüm ödemeler için get çağrısı
    @GetMapping
    public List<PaymentDTO> getAllPayments() {
        return paymentService.getAllPayments();
    }
    //tek yapılacak olan ödemeler için
    @GetMapping("/{id}")
    public PaymentDTO getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }
    @GetMapping("/student/{studentName}")
    public List<PaymentDTO>filterByStudentName(
            @PathVariable String studentName){
        return paymentService.filterByStudentName(studentName);

    }
    //ödeme durumuna göre filtreleme yapmak için
    @GetMapping("/status/{status}")
    public List<PaymentDTO> filterByStatus(
            @PathVariable String status){
        return paymentService.filterByStatus(status);
    }

    //yeni bir ödeme eklemek için
    @PostMapping()
    public ResponseEntity<PaymentDTO> createPayment(@RequestBody PaymentDTO paymentDTO){
        PaymentDTO createdPayment=paymentService.createPayment(paymentDTO);
        return ResponseEntity.ok(createdPayment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaymentDTO> updatePayment(
            @PathVariable Long id,
            @RequestBody PaymentDTO paymentDTO){
        PaymentDTO updatePayment=paymentService.updatePayment(id,paymentDTO);
        return ResponseEntity.ok(updatePayment);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id){
        paymentService.deletePayment(id);
        return ResponseEntity.noContent().build();
    }


}