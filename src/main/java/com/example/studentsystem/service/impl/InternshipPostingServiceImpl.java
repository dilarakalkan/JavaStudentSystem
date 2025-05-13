package com.example.studentsystem.service.impl;

import com.example.studentsystem.repository.InternshipPostingRepository;
import com.example.studentsystem.service.InternshipPostingService;
import org.springframework.stereotype.Service;

@Service
public class InternshipPostingServiceImpl implements InternshipPostingService {

    private final InternshipPostingRepository internshipPostingRepository;

    public InternshipPostingServiceImpl(InternshipPostingRepository internshipPostingRepository) {
        this.internshipPostingRepository = internshipPostingRepository;
    }
}
