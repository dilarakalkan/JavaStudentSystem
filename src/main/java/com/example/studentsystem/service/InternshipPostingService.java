package com.example.studentsystem.service;

import com.example.studentsystem.dto.InternshipPostingDTO;

import java.util.List;

public interface InternshipPostingService {

    List<InternshipPostingDTO> getAllInternships();

    InternshipPostingDTO getInternshipById(Long id);

    List<InternshipPostingDTO> filterByField(String field);

    List<InternshipPostingDTO> filterByCity(String city);

    InternshipPostingDTO createInternship(InternshipPostingDTO internshipDTO);

    InternshipPostingDTO updateInternship(Long id, InternshipPostingDTO internshipDTO);

    void deleteInternship(Long id);
}
