package com.example.studentsystem.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

    @Getter
    @Setter
    public class InternshipApplicationDTO {
        private Long id;
        private LocalDateTime applicationDate;
        private String applicationStatus;
        private Long internshipPostingId;
    }



