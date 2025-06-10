package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.CompanyDTO;
import com.example.studentsystem.entity.Company;
import com.example.studentsystem.repository.CompanyRepository;
import com.example.studentsystem.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        Company entity = convertToEntity(companyDTO);
        Company saved = companyRepository.save(entity);
        return saved;
    }

    @Override
    public Company updateCompany(Long id, CompanyDTO companyDTO) {
        Company existing = companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found with id: " + id));

        existing.setCompanyName(companyDTO.getCompanyName());
        existing.setLocation(companyDTO.getLocation());
        existing.setSector(companyDTO.getSector());

        Company updated = companyRepository.save(existing);
        return ;
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepository.findById(id)
                .ifPresentOrElse(
                        companyRepository::delete,
                        () -> { throw new RuntimeException("Company not found with id: " + id); }
                );
    }

    // --- Mapping helpers ---
    private CompanyDTO convertToDTO(Company company) {
        CompanyDTO dto = new CompanyDTO();
        dto.setId(company.getId());
        dto.setCompanyName(company.getCompanyName());
        dto.setLocation(company.getLocation());
        dto.setSector(company.getSector());
        return dto;
    }

    private Company convertToEntity(CompanyDTO dto) {
        Company company = new Company();
        company.setCompanyName(dto.getCompanyName());
        company.setLocation(dto.getLocation());
        company.setSector(dto.getSector());
        return company;
    }
}
