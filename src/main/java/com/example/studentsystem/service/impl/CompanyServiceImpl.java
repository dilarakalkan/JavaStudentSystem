package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.CompanyDTO;
import com.example.studentsystem.entity.Company;
import com.example.studentsystem.repository.CompanyRepository;
import com.example.studentsystem.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
    @Override
    public Optional<Company> getCompanyById(Long id) {
        return companyRepository.findById(id);
    }

    @Override
    public Company createCompany(CompanyDTO companyDTO) {
        return null;
    }

    @Override
    public Company updateCompany(Long İD, CompanyDTO companyDTO) {
        return null;
    }

    @Override
    public void deleteCompany(Long id) {

    }
}
