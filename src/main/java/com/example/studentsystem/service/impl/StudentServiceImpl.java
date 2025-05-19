package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.StudentDTO;
import com.example.studentsystem.entity.Student;
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
    public Student createStudent(StudentDTO studentDTO) {
        Student student=new Student();
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, StudentDTO studentDTO) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
        return studentRepository.save(student);

    }

    @Override
    public void deleteStudent(Long id) {

    }
}
