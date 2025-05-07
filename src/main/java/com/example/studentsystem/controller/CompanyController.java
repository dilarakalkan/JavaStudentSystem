package com.example.studentsystem.controller;
import com.example.studentsystem.dto.CompanyDTO;
import com.example.studentsystem.service.CompanyService;;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/company")
public class CompanyController {
    private final CompanyService companyService;
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @GetMapping
    public List<CompanyDTO> getAllCompanies() {
        return companyService.getAllCompanies();
    }
    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO> getCompanyById(@PathVariable Long id,@RequestBody CompanyDTO companyDTO){
        CompanyDTO company=companyService.getCompanyById(id);
        if(company==null){
            return  ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(company);
    }
    @PostMapping
    public ResponseEntity<CompanyDTO>createCompany(@RequestBody CompanyDTO companyDTO){
        CompanyDTO created=companyService.createCompany(companyDTO);
        return ResponseEntity.status(201).body(created);
    }
    @PutMapping("/{id}")
    public ResponseEntity<CompanyDTO> updateCompany(@PathVariable Long id, @RequestBody CompanyDTO companyDTO){
        CompanyDTO updated=companyService.updateCompany(id ,companyDTO);
        if(updated==null){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(updated);
    }

    @DeleteMapping
    public  ResponseEntity<CompanyDTO> deleteCompany(@PathVariable Long id){
        companyService.deleteCompany(id);
        return ResponseEntity.noContent().build();
    }




}
