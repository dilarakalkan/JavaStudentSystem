package com.example.studentsystem.controller;

import com.example.studentsystem.dto.InternshipApplicationDTO;
import com.example.studentsystem.entity.Calendar;
import com.example.studentsystem.entity.InternshipApplication;
import com.example.studentsystem.service.InternshipApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/internship-applications")
public class InternshipApplicationController {

    private final InternshipApplicationService applicationService;

    public InternshipApplicationController(InternshipApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public ResponseEntity<List<InternshipApplication>> getAllApplications() {
        List<InternshipApplication> applications = applicationService.getAllApplications();
        return ResponseEntity.ok(applications);
    }

//hepsi burdaki gibi olucak dto kaldırma
    @PostMapping
    public ResponseEntity<?> createApplication(@RequestBody InternshipApplicationDTO applicationDTO) {
        return ResponseEntity.ok().body(applicationService.createApplication(applicationDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateApplication(@PathVariable Long id, @RequestBody InternshipApplicationDTO applicationDTO) {
        return ResponseEntity.ok().body(applicationService.updateApplication(id, applicationDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplication(id);
        return ResponseEntity.noContent().build();
    }
}
