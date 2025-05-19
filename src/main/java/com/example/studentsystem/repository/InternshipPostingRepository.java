package com.example.studentsystem.repository;

import com.example.studentsystem.entity.InternshipApplication;
import com.example.studentsystem.entity.InternshipPosting;
import com.example.studentsystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface InternshipPostingRepository extends JpaRepository<InternshipPosting,Long> {

}


