package com.example.studentsystem.service;

import com.example.studentsystem.dto.CompanyDTO;
import com.example.studentsystem.entity.Company;

import java.util.List;

public interface CompanyService {
    List<CompanyDTO>getAllCompanies();
    CompanyDTO getCompanyById(Long id);
    Company createCompany(CompanyDTO companyDTO);
    Company updateCompany(Long İD,CompanyDTO companyDTO);
    void deleteCompany(Long id);
}
