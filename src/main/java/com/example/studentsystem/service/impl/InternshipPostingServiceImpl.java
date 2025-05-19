package com.example.studentsystem.service.impl;
import com.example.studentsystem.dto.InternshipPostingDTO;
import com.example.studentsystem.repository.InternshipPostingRepository;
import com.example.studentsystem.service.InternshipPostingService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InternshipPostingServiceImpl implements InternshipPostingService {
    private final InternshipPostingRepository internshipPostingRepository;


    public InternshipPostingServiceImpl(InternshipPostingRepository internshipPostingRepository) {
        this.internshipPostingRepository = internshipPostingRepository;
    }

    @Override
    public List<InternshipPostingDTO> getAllPostings() {
        return null;
    }

    @Override
    public InternshipPostingDTO getPostingById(Long id) {
        return null;
    }

    @Override
    public InternshipPostingDTO createPosting(InternshipPostingDTO postingDTO) {
        return null;
    }

    @Override
    public InternshipPostingDTO updatePosting(Long id, InternshipPostingDTO postingDTO) {
        return null;
    }

    @Override
    public void deletePosting(Long id) {

    }
}
