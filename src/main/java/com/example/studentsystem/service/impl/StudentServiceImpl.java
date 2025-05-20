package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.StudentDTO;
import com.example.studentsystem.entity.Student;
import com.example.studentsystem.enums.MessageEnum;
import com.example.studentsystem.repository.StudentRepository;
import com.example.studentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

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
        //setin ıdsi olmaz
        student.setStudentNumber(studentDTO.getStudentNumber());
        student.setDepartment(studentDTO.getDepartment());
        student.setUniversity(studentDTO.getUniversity());
        return studentRepository.save(student);
        //repositorye .save metodunu kullandığında gönderilen entityinin idsi varsa update eder yoksa yeni bir id oluşturur ve create eder
    }

    @Override
    public Student updateStudent(StudentDTO studentDTO) {

        Student student = studentRepository.findById(studentDTO.getId())
                .orElseThrow(() -> new RuntimeException(MessageEnum.BULUNAMADI.getMessages1() + studentDTO.getId()));

        student.setStudentNumber(studentDTO.getStudentNumber());
        student.setDepartment(studentDTO.getDepartment());
        student.setUniversity(studentDTO.getUniversity());
        return studentRepository.save(student);

    }

    @Override
    public void deleteStudent(Long id) {

    }
}
