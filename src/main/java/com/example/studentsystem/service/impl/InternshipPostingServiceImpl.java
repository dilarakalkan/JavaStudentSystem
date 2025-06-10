package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.InternshipPostingDTO;
import com.example.studentsystem.entity.Company;
import com.example.studentsystem.entity.InternshipPosting;
import com.example.studentsystem.repository.CompanyRepository;
import com.example.studentsystem.repository.InternshipPostingRepository;
import com.example.studentsystem.service.InternshipPostingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternshipPostingServiceImpl implements InternshipPostingService {

    private final InternshipPostingRepository internshipPostingRepository;
    private final CompanyRepository companyRepository;

    public InternshipPostingServiceImpl(InternshipPostingRepository internshipPostingRepository,
                                        CompanyRepository companyRepository) {
        this.internshipPostingRepository = internshipPostingRepository;
        this.companyRepository = companyRepository;
    }

    @Override
    public List<InternshipPosting> getAllPostings() {
        return internshipPostingRepository.findAll();
    }

    @Override
    public Optional<InternshipPosting> getPostingById(Long id) {
        return internshipPostingRepository.findById(id);
    }

    @Override
    public InternshipPosting createPosting(InternshipPostingDTO postingDTO) {
        InternshipPosting internshipPosting = new InternshipPosting();
        internshipPosting.setTitle(postingDTO.getTitle());
        internshipPosting.setDescription(postingDTO.getDescription());
        internshipPosting.setLocation(postingDTO.getLocation());
        internshipPosting.setWorkType(postingDTO.getWorkType());
        internshipPosting.setApplicationDeadline(postingDTO.getApplicationDeadline());

        Company company = companyRepository.findByCompanyName(postingDTO.getCompany())
                .orElseThrow(() -> new RuntimeException("Company not found: " + postingDTO.getCompany()));

        internshipPosting.setCompany(company);

        return internshipPostingRepository.save(internshipPosting);
    }

    @Override
    public InternshipPosting updatePosting(Long id, InternshipPostingDTO postingDTO) {
        InternshipPosting internshipPosting = internshipPostingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Posting not found with id: " + id));

        internshipPosting.setTitle(postingDTO.getTitle());
        internshipPosting.setDescription(postingDTO.getDescription());


        Company company = companyRepository.findByCompanyName(postingDTO.getCompany())
                .orElseThrow(() -> new RuntimeException("Company not found: " + postingDTO.getCompany()));

        internshipPosting.setCompany(company);

        return internshipPostingRepository.save(internshipPosting);
    }

    @Override
    public void deletePosting(Long id) {
        InternshipPosting posting = internshipPostingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Posting not found with id: " + id));
        internshipPostingRepository.delete(posting);
    }
}
