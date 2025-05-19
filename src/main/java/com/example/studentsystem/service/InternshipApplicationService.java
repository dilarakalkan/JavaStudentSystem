package com.example.studentsystem.service;

import com.example.studentsystem.dto.InternshipApplicationDTO;
import com.example.studentsystem.entity.InternshipApplication;

import java.util.List;

public interface InternshipApplicationService {

    List<InternshipApplicationDTO> getAllApplications();

    InternshipApplicationDTO getApplicationById(Long id);

    List<InternshipApplicationDTO> getApplicationsByStatus(String status);

    InternshipApplication createApplication(InternshipApplicationDTO applicationDTO);

    InternshipApplication updateApplication(Long id, InternshipApplicationDTO applicationDTO);

    InternshipApplication updateApplication(InternshipApplicationDTO applicationDTO);

    void deleteApplication(Long id);
}
