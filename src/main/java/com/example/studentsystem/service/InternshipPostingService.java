package com.example.studentsystem.service;

import com.example.studentsystem.dto.InternshipPostingDTO;
import com.example.studentsystem.entity.InternshipPosting;

import java.util.List;
import java.util.Optional;

public interface InternshipPostingService {
    List<InternshipPosting> getAllPostings();
    Optional<InternshipPosting> getPostingById(Long id);
    InternshipPosting createPosting(InternshipPostingDTO postingDTO);
    InternshipPostingDTO updatePosting(Long id,InternshipPostingDTO postingDTO);
    void deletePosting(Long id);
}
