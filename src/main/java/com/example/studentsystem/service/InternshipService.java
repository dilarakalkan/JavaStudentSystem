package com.example.studentsystem.service;
import com.example.studentsystem.dto.InternshipDTO;

import java.util.List;

public interface InternshipService {

    List<InternshipDTO> getAllInternships();

    InternshipDTO getInternshipById(Long id);

    List<InternshipDTO> filterByField(String field);

    List<InternshipDTO> filterByCity(String city);
}
