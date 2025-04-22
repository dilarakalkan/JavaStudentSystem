package com.example.studentsystem.dto;

import java.time.LocalDateTime;

public class CalendarDTO {
    private Long id;
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String timeZone;

public CalendarDTO(Long id,String title,LocalDateTime startDate,LocalDateTime endDate,String timeZone){
    this.id=id;
    this.title=title;
    this.startDate=startDate;
    this.endDate=endDate;
    this.timeZone=timeZone;
}
}
