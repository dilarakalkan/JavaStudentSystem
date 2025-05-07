package com.example.studentsystem.controller;

import com.example.studentsystem.entity.Submission;
import com.example.studentsystem.service.SubmissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/submissions")  // Bu doğru şekilde kullanılmış
public class SubmissionController {

    private final SubmissionService submissionService;

    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    // Tüm başvuruları listeleme
    @GetMapping
    public List<Submission> getAllSubmissions() {
        return submissionService.getAllSubmissions();
    }

    // ID'ye göre başvuru getirme
    @GetMapping("/{id}")
    public ResponseEntity<Submission> getSubmissionById(@PathVariable Long id) {
        Optional<Submission> submission = submissionService.getSubmissionById(id);
        return submission.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Yeni başvuru kaydetme
    @PostMapping
    public ResponseEntity<Submission> createSubmission(@RequestBody Submission submission) {
        Submission savedSubmission = submissionService.saveSubmission(submission);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSubmission);
    }

    // Başvuru silme
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubmission(@PathVariable Long id) {
        Optional<Submission> submission = submissionService.getSubmissionById(id);
        if (submission.isPresent()) {
            submissionService.deleteSubmission(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Başvuru güncelleme
    @PutMapping("/{id}")
    public ResponseEntity<Submission> updateSubmission(@PathVariable Long id, @RequestBody Submission updatedSubmission) {
        Optional<Submission> existingSubmission = submissionService.getSubmissionById(id);
        if (existingSubmission.isPresent()) {
            updatedSubmission.setId(id);  // Mevcut ID'yi güncellenmiş objeye atıyoruz
            Submission savedSubmission = submissionService.saveSubmission(updatedSubmission);
            return ResponseEntity.ok(savedSubmission);
        }
        return ResponseEntity.notFound().build();
    }
}
