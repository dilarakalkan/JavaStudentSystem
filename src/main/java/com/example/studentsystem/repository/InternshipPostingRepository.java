package com.example.studentsystem.repository;

import com.example.studentsystem.entity.InternshipPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipPostingRepository extends JpaRepository<InternshipPosting,Long> {

}


