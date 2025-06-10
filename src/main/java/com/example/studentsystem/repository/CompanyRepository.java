package com.example.studentsystem.repository;

import com.example.studentsystem.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

    Optional<Object> findByCompanyName(String company);
}
