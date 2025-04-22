package com.example.studentsystem.controller;

import com.example.studentsystem.entity.Calendar;
import com.example.studentsystem.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calendars")

public class CalendarController {
    @Autowired
    private CalendarService calendarService;
    @GetMapping
    public List<Calendar> getAllCalendars() {
        return calendarService.getAllCalendars();
        }
        @GetMapping("/{id}")
    public Optional<Calendar> getCalanderById(@PathVariable Long id){
        return calendarService.getCalendarById(id);
        }
        @PostMapping
    public Calendar createCalander(@RequestBody Calendar calendar){
        return calendarService.saveCalendar(calendar);
        }

        @DeleteMapping("/{id")
    public void deleteCalendar(@PathVariable Long id){
        calendarService.deleteCalendar(id);
        }




    }











