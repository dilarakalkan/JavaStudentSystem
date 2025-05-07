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

    // Get all internships
    @GetMapping
    public List<InternshipDTO> getAllInternships() {
        return internshipService.getAllInternships();
    }

    // Get internship by ID
    @GetMapping("/{id}")
    public InternshipDTO getInternshipById(@PathVariable Long id) {
        return internshipService.getInternshipById(id);
    }

    // Filter internships by field
    @GetMapping("/field/{field}")
    public List<InternshipDTO> filterByField(@PathVariable String field) {
        return internshipService.filterByField(field);
    }

    // Filter internships by city
    @GetMapping("/city/{city}")
    public List<InternshipDTO> filterByCity(@PathVariable String city) {
        return internshipService.filterByCity(city);
    }

    // Create a new internship
    @PostMapping
    public InternshipDTO createInternship(@RequestBody InternshipDTO internshipDTO) {
        return internshipService.createInternship(internshipDTO);
    }

    // Update an existing internship
    @PutMapping("/{id}")
    public InternshipDTO updateInternship(@PathVariable Long id, @RequestBody InternshipDTO internshipDTO) {
        return internshipService.updateInternship(id, internshipDTO);
    }

    // Delete an internship by ID
    @DeleteMapping("/{id}")
    public void deleteInternship(@PathVariable Long id) {
        internshipService.deleteInternship(id);
    }
}
