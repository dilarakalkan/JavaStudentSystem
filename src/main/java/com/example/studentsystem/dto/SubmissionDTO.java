package com.example.studentsystem.dto;

public class SubmissionDTO {
    private Long id;
    private String company;
    private String position;
    private String status;

    public SubmissionDTO(Long id, String company, String position, String status) {
        this.id = id;
        this.company =company;
        this.position =position;
        this.status = status;
    }


}
