package com.example.studentsystem.service.impl;


import com.example.studentsystem.entity.Submission;
import com.example.studentsystem.repository.SubmissionRepository;
import com.example.studentsystem.service.SubmissionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubmissionServiceImpl implements SubmissionService {

    private final SubmissionRepository submissionRepository;

    public SubmissionServiceImpl(SubmissionRepository submissionRepository) {
        this.submissionRepository = submissionRepository;
    }

    @Override
    public Submission saveSubmission(Submission submission) {
        return submissionRepository.save(submission);
    }

    @Override
    public List<Submission> getAllSubmissions() {
        return submissionRepository.findAll(); // Tümünü döner
    }

    @Override
    public Optional<Submission> getSubmissionById(Long id) {
        return submissionRepository.findById(id); // Verilen ID'ye göre bir submission arar
    }

    @Override
    public Submission updateSubmission(Long id, Submission submission) {
        return submissionRepository.findById(id) // ID'ye göre submission'ı bulmakk için
                .map(existingSubmission -> {
                    existingSubmission.setCompany(submission.getCompany());
                    existingSubmission.setPosition(submission.getPosition()); //günceller
                    existingSubmission.setStatus(submission.getStatus());
                    return submissionRepository.save(existingSubmission);
                })
                .orElseThrow(() -> new RuntimeException("Submission not found with id: " + id)); // ID bulunamazsa hata fırlatır
    }

    @Override
    public void deleteSubmission(Long id) {
        submissionRepository.deleteById(id);
    }
}
