package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.CompanyDTO;
import com.example.studentsystem.entity.Company;
import com.example.studentsystem.repository.CompanyRepository;
import com.example.studentsystem.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<CompanyDTO> getAllCompanies() {
        return null;
    }

    @Override
    public CompanyDTO getCompanyById(Long id) {
        return null;
    }

    @Override
    public Company createCompany(CompanyDTO companyDTO) {
        Company company = new Company();
        company.setCompanyName(companyDTO.getCompanyName());
        company.setLocation(companyDTO.getLocation());
        company.setSector(companyDTO.getSector());
        companyRepository.save(company);
        return company;
    }

    @Override
    public Company updateCompany(Long İD, CompanyDTO companyDTO) {

        return null;
    }

    @Override
    public void deleteCompany(Long id) {

    }
}

