package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.CompanyDTO;
import com.example.studentsystem.repository.CompanyRepository;
import com.example.studentsystem.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepository companyRepository;

    @Override
    public List<CompanyDTO> getAllCompanies() {
        return null;
    }

    @Override
    public CompanyDTO getCompanyById(Long id) {
        return null;
    }

    @Override
    public CompanyDTO createCompany(CompanyDTO companyDTO) {
        return null;
    }

    @Override
    public CompanyDTO updateCompany(Long İD, CompanyDTO companyDTO) {
        return null;
    }

    @Override
    public void deleteCompany(Long id) {

    }
}

