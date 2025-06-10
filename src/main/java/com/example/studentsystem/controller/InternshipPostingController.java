package com.example.studentsystem.controller;


import com.example.studentsystem.dto.InternshipPostingDTO;
import com.example.studentsystem.entity.InternshipPosting;
import com.example.studentsystem.enums.MessageEnum;
import com.example.studentsystem.service.InternshipPostingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/internship-postings")
public class InternshipPostingController {
    private final InternshipPostingService internshipPostingService;

    public InternshipPostingController(InternshipPostingService internshipPostService) {
        this.internshipPostingService = internshipPostService;
    }

    @GetMapping
    public ResponseEntity<List<InternshipPosting>> getAllPosting() {
        List<InternshipPosting> internshipPostings = internshipPostingService.getAllPostings();
        return ResponseEntity.ok(internshipPostings);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InternshipPostingDTO> getPostingById(@PathVariable Long id) {
        Optional<InternshipPosting> posting = internshipPostingService.getPostingById(id);
        return ResponseEntity.notFound().build();
    }

    //düzenle
    @PostMapping
    public ResponseEntity<?> createPosting(@RequestBody InternshipPostingDTO internshipPostingDTO) {
        internshipPostingService.createPosting(internshipPostingDTO);
        return ResponseEntity.ok(MessageEnum.ISLEM_BASARILI);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePosting(@PathVariable Long id , @RequestBody InternshipPostingDTO postingDTO) {
        InternshipPosting updatedPosting = internshipPostingService.updatePosting(id, postingDTO);
        return ResponseEntity.ok(MessageEnum.ISLEM_BASARILI);
    }

    @DeleteMapping
    public ResponseEntity<?> deletePosting(@PathVariable Long id) {
        internshipPostingService.deletePosting(id);
        return ResponseEntity.noContent().build();
    }

}



