package com.example.studentsystem.service;

import com.example.studentsystem.dto.InternshipPostingDTO;

import java.util.List;

public interface InternshipPostingService {
    List<InternshipPostingDTO>getAllPostings();
    InternshipPostingDTO getPostingById(Long id);
    InternshipPostingDTO createPosting(InternshipPostingDTO postingDTO);
    InternshipPostingDTO updatePosting(Long id,InternshipPostingDTO postingDTO);
    void deletePosting(Long id);
}
