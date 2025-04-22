package com.example.studentsystem.service;

import com.example.studentsystem.entity.Calendar;
import com.example.studentsystem.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface CalendarService {
        List<Calendar> getAllCalendars();
        Optional<Calendar> getCalendarById(Long id);
        Calendar saveCalendar(Calendar calendar);
        void deleteCalendar(Long id);
    }
