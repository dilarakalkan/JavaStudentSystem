package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.StudentDTO;
import com.example.studentsystem.entity.Student;
import com.example.studentsystem.repository.StudentRepository;
import com.example.studentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(student -> {
                    StudentDTO dto = new StudentDTO();
                    dto.setId(student.getId());
                    dto.setStudentNumber(student.getStudentNumber());
                    dto.setUniversity(student.getUniversity());
                    dto.setDepartment(student.getDepartment());
                    return dto;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Optional<StudentDTO> getStudentById(Long id) {
        return studentRepository.findById(id)
                .map(student -> {
                    StudentDTO dto = new StudentDTO();
                    dto.setId(student.getId());
                    dto.setStudentNumber(student.getStudentNumber());
                    dto.setUniversity(student.getUniversity());
                    dto.setDepartment(student.getDepartment());
                    return dto;
                });
    }

    @Override
    public Student createStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setStudentNumber(studentDTO.getStudentNumber());
        student.setUniversity(studentDTO.getUniversity());
        student.setDepartment(studentDTO.getDepartment());
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, StudentDTO studentDTO) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        student.setStudentNumber(studentDTO.getStudentNumber());
        student.setUniversity(studentDTO.getUniversity());
        student.setDepartment(studentDTO.getDepartment());
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Optional<StudentDTO> getStudentByStudentNumber(String studentNumber) {
        return studentRepository.findByStudentNumber(studentNumber)

                });
    }
}
