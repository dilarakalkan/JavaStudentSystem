package com.example.studentsystem.service;

import com.example.studentsystem.dto.CompanyDTO;

import java.util.List;

public interface CompanyService {
    List<CompanyDTO>getAllCompanies();
    CompanyDTO getCompanyById(Long id);
    CompanyDTO createCompany(CompanyDTO companyDTO);
    CompanyDTO updateCompany(Long İD,CompanyDTO companyDTO);
    void deleteCompany(Long id);
}
