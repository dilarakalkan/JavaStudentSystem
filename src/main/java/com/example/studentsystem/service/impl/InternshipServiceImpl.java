package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.InternshipDTO;
import com.example.studentsystem.entity.Internship;
import com.example.studentsystem.repository.InternshipRepository;
import com.example.studentsystem.service.InternshipService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


public class InternshipServiceImpl implements InternshipService {

    private final InternshipRepository internshipRepository;

    public InternshipServiceImpl(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    @Override
    public List<InternshipDTO> filterByCity(String city) {

        List<Internship> internshipList = internshipRepository.findByCity(city);

        return internshipList.
                stream()
                .map(internship -> new InternshipDTO(internship.getId(), internship.getTitle(), internship.getCompany(), internship.getField(), internship.getApplicationDate()))
                .collect(Collectors.toList());
    }


    @Override
    public List<InternshipDTO> getAllInternships() {
        return null;
    }

    @Override
    public InternshipDTO getInternshipById(Long id) {
        return null;
    }

    @Override
    public List<InternshipDTO> filterByField(String field) {
        return null;
    }
}
