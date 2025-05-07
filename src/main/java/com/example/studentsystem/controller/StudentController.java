package com.example.studentsystem.controller;

import com.example.studentsystem.dto.StudentDTO;
import com.example.studentsystem.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentDTO>getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO>getStudentById(@PathVariable Long id) {
        StudentDTO studentDTO = studentService.getStudentById(id);
        if (studentDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentDTO);
    }
        @PostMapping
        public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO){
            StudentDTO createdStudent=studentService.createStudent(studentDTO);
                return ResponseEntity.status(200).body(createdStudent);

        }

            @PutMapping("/{id}")
        public ResponseEntity<StudentDTO> updateStudent(@PathVariable Long id,@RequestBody StudentDTO studentDTO){
                StudentDTO updatedStudent=studentService.updateStudent(id,studentDTO);
                if(updatedStudent==null){
                    return ResponseEntity.notFound().build();
                }
                return ResponseEntity.ok(updatedStudent);
            }

        @DeleteMapping("/{id}")
                public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
            studentService.deleteStudent(id);
            return ResponseEntity.noContent().build();
        }
    }


