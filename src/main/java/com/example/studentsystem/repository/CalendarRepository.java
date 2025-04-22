package com.example.studentsystem.repository;

import com.example.studentsystem.entity.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CalendarRepository extends JpaRepository<Calendar,Long> {
    //List<Calendar>findByStartDate(LocalDateTime date); //belirli tarihteki etkinlikler için

}
