package com.example.studentsystem.service;

import com.example.studentsystem.dto.InternshipApplicationDTO;
import com.example.studentsystem.entity.InternshipApplication;

import java.util.List;
import java.util.Optional;

public interface InternshipApplicationService {

    List<InternshipApplication> getAllApplications();

    Optional<InternshipApplication> getApplicationById(Long id);

    List<InternshipApplicationDTO> getApplicationsByStatus(String status);

    InternshipApplication createApplication(InternshipApplicationDTO applicationDTO);

    InternshipApplication updateApplication(Long id, InternshipApplicationDTO applicationDTO);

    void deleteApplication(Long id);
}
