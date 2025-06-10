package com.example.studentsystem.service.impl;

import com.example.studentsystem.dto.CalendarDTO;
import com.example.studentsystem.entity.Calendar;
import com.example.studentsystem.repository.CalendarRepository;
import com.example.studentsystem.service.CalendarService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class CalendarServiceImpl implements CalendarService {
    private final CalendarRepository calendarRepository;

    public CalendarServiceImpl(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    @Override
    public List<Calendar> getAllCalendars() {
        return calendarRepository.findAll();
    }

    @Override
    public Optional<Calendar> getCalendarById(Long id) {

        return calendarRepository.findById(id);
    }

    @Override
    public CalendarDTO createCalendar(CalendarDTO calendarDTO) {
        return null;
    }

    @Override
    public CalendarDTO updateCalendar(Long id, CalendarDTO calendarDTO) {
        return null;
    }

    @Override
    public Calendar createCalendar(Calendar calendar) {
        calendar.setCreatedAt(LocalDateTime.now());
        calendar.setUpdatedAt(LocalDateTime.now());
        return calendarRepository.save(calendar);
    }



    @Override
    public void deleteCalendar(Long id) {
        calendarRepository.deleteById(id);
    }
}