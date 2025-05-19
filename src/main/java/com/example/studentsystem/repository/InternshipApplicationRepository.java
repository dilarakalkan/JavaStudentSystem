package com.example.studentsystem.repository;

import com.example.studentsystem.entity.InternshipApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipApplicationRepository extends JpaRepository<InternshipApplication, Long> {
    // İhtiyaç duyduğunuz custom sorguları buraya ekleyebilirsiniz
}
