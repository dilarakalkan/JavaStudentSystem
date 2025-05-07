package com.example.studentsystem.controller;

import com.example.studentsystem.dto.InternshipPostingDTO;
import com.example.studentsystem.service.InternshipPostingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/internships")
public class InternshipPostingController {

    private final InternshipPostingService internshipService;

    public InternshipPostingController(InternshipPostingService internshipService) {
        this.internshipService = internshipService;
    }

    // Get all internships
    @GetMapping
    public List<InternshipPostingDTO> getAllInternships() {
        return internshipService.getAllInternships();
    }

    // Get internship by ID
    @GetMapping("/{id}")
    public InternshipPostingDTO getInternshipById(@PathVariable Long id) {
        return internshipService.getInternshipById(id);
    }

    // Filter internships by field
    @GetMapping("/field/{field}")
    public List<InternshipPostingDTO> filterByField(@PathVariable String field) {
        return internshipService.filterByField(field);
    }

    // Filter internships by city
    @GetMapping("/city/{city}")
    public List<InternshipPostingDTO> filterByCity(@PathVariable String city) {
        return internshipService.filterByCity(city);
    }

    // Create a new internship
    @PostMapping
    public InternshipPostingDTO createInternship(@RequestBody InternshipPostingDTO internshipDTO) {
        return internshipService.createInternship(internshipDTO);
    }

    // Update an existing internship
    @PutMapping("/{id}")
    public InternshipPostingDTO updateInternship(@PathVariable Long id, @RequestBody InternshipPostingDTO internshipDTO) {
        return internshipService.updateInternship(id, internshipDTO);
    }

    // Delete an internship by ID
    @DeleteMapping("/{id}")
    public void deleteInternship(@PathVariable Long id) {
        internshipService.deleteInternship(id);
    }
}
