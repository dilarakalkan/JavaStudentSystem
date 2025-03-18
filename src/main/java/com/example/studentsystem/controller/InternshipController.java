package com.example.studentsystem.controller;

import com.example.studentsystem.dto.InternshipDTO;
import com.example.studentsystem.entity.Internship;
import com.example.studentsystem.service.InternshipService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/internships")
public class InternshipController {

    private final InternshipService internshipService;

    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

    @GetMapping
    public List<InternshipDTO> getAllInternships() {
        return internshipService.getAllInternships();
    }

    @GetMapping("/{id}")
    public InternshipDTO getInternshipById(@PathVariable Long id) {
        return internshipService.getInternshipById(id);
    }

    @GetMapping("/field/{field}")
    public List<InternshipDTO> filterByField(@PathVariable String field){
        return internshipService.filterByField(field); // Alan filtresi uygulanarak stajlar
    }
    @GetMapping("/city/{city}")
    public List<InternshipDTO> filterByCity(@PathVariable String city){
        return internshipService.filterByCity(city);
    }


}
