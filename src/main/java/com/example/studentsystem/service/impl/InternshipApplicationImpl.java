package com.example.studentsystem.service.impl;
import com.example.studentsystem.dto.InternshipApplicationDTO;
import com.example.studentsystem.entity.InternshipApplication;
import com.example.studentsystem.repository.InternshipApplicationRepository;
import com.example.studentsystem.service.InternshipApplicationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class InternshipApplicationImpl implements InternshipApplicationService {
    private final InternshipApplicationRepository internshipApplicationRepository;
    public InternshipApplicationImpl(InternshipApplicationRepository internshipApplicationRepository) {
        this.internshipApplicationRepository = internshipApplicationRepository;
    }

    @Override
    public List<InternshipApplicationDTO> getAllApplications() {
        return null;
    }

    @Override
    public InternshipApplicationDTO getApplicationById(Long id) {
        return null;
    }

    @Override
    public List<InternshipApplicationDTO> getApplicationsByStatus(String status) {
        return null;
    }

    @Override
    public InternshipApplication createApplication(InternshipApplicationDTO applicationDTO) {
        InternshipApplication internshipApplication = new InternshipApplication();
        internshipApplication.setApplicationStatus("test");
        //testi öylesine yazdık
        //bu format doğru create-update de böyle olucak
        internshipApplicationRepository.save(internshipApplication);
        return internshipApplication;
    }

    @Override
    public InternshipApplication updateApplication(Long id,InternshipApplicationDTO applicationDTO) {
        InternshipApplication internshipApplication=new InternshipApplication();
        internshipApplicationRepository.save(internshipApplication);
        return internshipApplication;
    }

    @Override
    public void deleteApplication(Long id) {

    }
}
