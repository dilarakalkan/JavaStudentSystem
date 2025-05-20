package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.InternshipPostingDTO;
import com.example.studentsystem.entity.InternshipPosting;
import com.example.studentsystem.repository.InternshipPostingRepository;
import com.example.studentsystem.service.InternshipPostingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class InternshipPostingServiceImpl implements InternshipPostingService {
    private final InternshipPostingRepository internshipPostingRepository;


    public InternshipPostingServiceImpl(InternshipPostingRepository internshipPostingRepository) {
        this.internshipPostingRepository = internshipPostingRepository;
    }

    @Override
    public List<InternshipPosting> getAllPostings() {
        return internshipPostingRepository.findAll();
    }

    @Override
    public Optional<InternshipPosting> getPostingById(Long id) {
        return internshipPostingRepository.findById(id);
    }

    @Override
    public InternshipPosting createPosting(InternshipPostingDTO postingDTO) {
        InternshipPosting internshipPosting = new InternshipPosting();
        internshipPostingRepository.save(internshipPosting);

        return internshipPosting;
    }

    @Override
    public InternshipPostingDTO updatePosting(Long id, InternshipPostingDTO postingDTO) {

        return null;
    }

    @Override
    public void deletePosting(Long id) {

    }
}
