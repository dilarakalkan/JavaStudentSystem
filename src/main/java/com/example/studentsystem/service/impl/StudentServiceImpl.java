package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.StudentDTO;
import com.example.studentsystem.repository.StudentRepository;
import com.example.studentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;


    @Override
    public List<StudentDTO> getAllStudents() {
        return null;
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        return null;
    }

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        return null;
    }

    @Override
    public StudentDTO updateStudent(Long id, StudentDTO studentDTO) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }
}
