package com.example.studentsystem.service;

import com.example.studentsystem.dto.StudentDTO;
import com.example.studentsystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
   List<StudentDTO> getAllStudents();
   StudentDTO getStudentById(Long id);
   StudentDTO createStudent(StudentDTO studentDTO);
   StudentDTO updateStudent(Long id,StudentDTO studentDTO);
   void deleteStudent(Long id); //işlem yapsın ama geriye bir değer döndürmesn


}
