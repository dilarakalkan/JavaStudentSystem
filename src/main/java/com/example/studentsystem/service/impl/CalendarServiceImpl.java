package com.example.studentsystem.service.impl;

import com.example.studentsystem.entity.Calendar;
import com.example.studentsystem.repository.CalendarRepository;
import com.example.studentsystem.service.CalendarService;
import org.springframework.stereotype.Service;

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
    public Calendar saveCalendar(Calendar calendar) {
        return calendarRepository.save(calendar);
    }

    public Calendar updateCalendar(Long id, Calendar calendar) {
        Optional<Calendar> existingCalendar = calendarRepository.findById(id);
        if (existingCalendar.isPresent()) {
            Calendar updatedCalendar = existingCalendar.get();
            updatedCalendar.setTitle(calendar.getTitle());
            updatedCalendar.setStartDate(calendar.getStartDate());
            updatedCalendar.setEndDate(calendar.getEndDate());
            updatedCalendar.setTimeZone(calendar.getTimeZone());
            return calendarRepository.save(updatedCalendar);
        } else {
            throw new RuntimeException("Calendar not found with id: " + id);
        }
    }

    @Override
    public void deleteCalendar(Long id) {
        calendarRepository.deleteById(id);
    }
}