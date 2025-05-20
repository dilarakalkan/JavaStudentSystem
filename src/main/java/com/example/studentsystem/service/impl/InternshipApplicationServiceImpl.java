package com.example.studentsystem.service.impl;
import com.example.studentsystem.dto.InternshipApplicationDTO;
import com.example.studentsystem.entity.InternshipApplication;
import com.example.studentsystem.entity.InternshipPosting;
import com.example.studentsystem.entity.Student;
import com.example.studentsystem.repository.InternshipApplicationRepository;
import com.example.studentsystem.repository.InternshipPostingRepository;
import com.example.studentsystem.repository.StudentRepository;
import com.example.studentsystem.service.InternshipApplicationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class InternshipApplicationServiceImpl implements InternshipApplicationService {
    private final InternshipApplicationRepository internshipApplicationRepository;
    private final StudentRepository studentRepository;
    private final InternshipPostingRepository internshipPostingRepository;


    public InternshipApplicationServiceImpl(InternshipApplicationRepository internshipApplicationRepository, StudentRepository studentRepository, InternshipPostingRepository internshipPostingRepository) {
        this.internshipApplicationRepository = internshipApplicationRepository;
        this.studentRepository = studentRepository;
        this.internshipPostingRepository = internshipPostingRepository;
    }

    @Override
    public List<InternshipApplication> getAllApplications() {
        return internshipApplicationRepository.findAll();
    }

    @Override
    public Optional<InternshipApplication> getApplicationById(Long id) {
        return internshipApplicationRepository.findById(id);
    }

    @Override
    public List<InternshipApplicationDTO> getApplicationsByStatus(String status) {
        return null;
    }

    @Override
    public InternshipApplication createApplication(InternshipApplicationDTO applicationDTO) {
       String idAktifKullanici = null; //burası session'dan alınacak

        Student student = studentRepository.getStudentByUserId(idAktifKullanici);

        Optional<InternshipPosting> internshipPosting = internshipPostingRepository.findById(applicationDTO.getId());

        InternshipApplication internshipApplication = new InternshipApplication();
        internshipApplication.setApplicationStatus("1");
        internshipApplication.setStudent(student);
        internshipApplication.setInternshipPosting(internshipPosting.get());


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
