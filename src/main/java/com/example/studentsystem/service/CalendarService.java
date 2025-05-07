package com.example.studentsystem.service;

import com.example.studentsystem.entity.Calendar;
import java.util.List;
import java.util.Optional;


public interface CalendarService {
        List<Calendar> getAllCalendars();
        Optional<Calendar> getCalendarById(Long id);
        Calendar saveCalendar(Calendar calendar);
        void deleteCalendar(Long id);
    }
