package com.example.studentsystem.repository;

import com.example.studentsystem.entity.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternshipRepository extends JpaRepository<Internship,Long> {
    List<Internship> findByTitleContainingOrCompanyContaining(String title, String company);
    List<Internship> findByField(String field);
    List<Internship> findByCity(String city);
}
