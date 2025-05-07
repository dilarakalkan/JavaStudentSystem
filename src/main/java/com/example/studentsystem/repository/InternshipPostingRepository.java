package com.example.studentsystem.repository;

import com.example.studentsystem.entity.InternshipPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternshipPostingRepository extends JpaRepository<InternshipPosting,Long> {
    List<InternshipPosting> findByTitleContainingOrCompanyContaining(String title, String company);
    List<InternshipPosting> findByField(String field);
    List<InternshipPosting> findByCity(String city);
}
