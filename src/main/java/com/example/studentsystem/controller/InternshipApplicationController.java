package com.example.studentsystem.controller;

import com.example.studentsystem.dto.InternshipApplicationDTO;
import com.example.studentsystem.service.InternshipApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/internship-applications")
public class InternshipApplicationController {

    private final InternshipApplicationService applicationService;

    public InternshipApplicationController(InternshipApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public ResponseEntity<List<InternshipApplicationDTO>> getAllApplications() {
        List<InternshipApplicationDTO> applications = applicationService.getAllApplications();
        return ResponseEntity.ok(applications);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InternshipApplicationDTO> getApplicationById(@PathVariable Long id) {
        InternshipApplicationDTO application = applicationService.getApplicationById(id);
        return application != null ? ResponseEntity.ok(application) : ResponseEntity.notFound().build();
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
