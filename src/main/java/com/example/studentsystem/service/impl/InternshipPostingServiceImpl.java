package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.InternshipPostingDTO;
import com.example.studentsystem.entity.InternshipPosting;
import com.example.studentsystem.repository.InternshipPostingRepository;
import com.example.studentsystem.service.InternshipPostingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InternshipPostingServiceImpl implements InternshipPostingService {

    private final InternshipPostingRepository internshipRepository;

    public InternshipPostingServiceImpl(InternshipPostingRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    @Override
    public List<InternshipPostingDTO> filterByCity(String city) {

        List<InternshipPosting> internshipList = internshipRepository.findByCity(city);

        return internshipList.
                stream()
                .map(internship -> new InternshipPostingDTO(internship.getId(), internship.getTitle(), internship.getCompany(), internship.getField(), internship.getApplicationDate()))
                .collect(Collectors.toList());
    }

    @Override
    public InternshipPostingDTO createInternship(InternshipPostingDTO internshipDTO) {
        return null;
    }

    @Override
    public InternshipPostingDTO updateInternship(Long id, InternshipPostingDTO internshipDTO) {
        return null;
    }

    @Override
    public void deleteInternship(Long id) {

    }


    @Override
    public List<InternshipPostingDTO> getAllInternships() {
        return null;
    }

    @Override
    public InternshipPostingDTO getInternshipById(Long id) {
        return null;
    }

    @Override
    public List<InternshipPostingDTO> filterByField(String field) {
        return null;
    }
}