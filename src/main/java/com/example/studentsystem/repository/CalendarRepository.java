package com.example.studentsystem.repository;

import com.example.studentsystem.entity.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface CalendarRepository extends JpaRepository<Calendar,Long> {
    //List<Calendar>findByStartDate(LocalDateTime date); //belirli tarihteki etkinlikler için

}
