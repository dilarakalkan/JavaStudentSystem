package com.example.studentsystem.service;


import com.example.studentsystem.entity.Submission;

import java.util.List;
import java.util.Optional;

public interface SubmissionService {
    Submission saveSubmission(Submission submission);
    List<Submission> getAllSubmissions();
    Optional<Submission> getSubmissionById(Long id);
    Submission updateSubmission(Long id, Submission submission);
    void deleteSubmission(Long id);
}