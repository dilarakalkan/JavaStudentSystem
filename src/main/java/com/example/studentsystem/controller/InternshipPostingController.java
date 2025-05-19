package com.example.studentsystem.controller;

import com.example.studentsystem.service.InternshipPostingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/internship-postings")
public class InternshipPostingController {
    private final InternshipPostingService internshipPostingService;
    public InternshipPostingController(InternshipPostingService internshipPostService) {
        this.internshipPostingService = internshipPostService;
    }
}



