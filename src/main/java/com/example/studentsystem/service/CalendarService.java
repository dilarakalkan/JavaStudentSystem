package com.example.studentsystem.service;

import com.example.studentsystem.dto.CalendarDTO;
import com.example.studentsystem.entity.Calendar;

import java.util.List;
import java.util.Optional;

public interface CalendarService {
    List<Calendar> getAllCalendars();
    Optional<Calendar> getCalendarById(Long id);
    CalendarDTO createCalendar(CalendarDTO calendarDTO);
    CalendarDTO updateCalendar(Long id, CalendarDTO calendarDTO);

    Calendar createCalendar(Calendar calendar);

    void deleteCalendar(Long id);
}
