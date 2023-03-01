package com.controller;

import com.model.Attendence;
import com.model.Student;
import com.services.AttendenceService;
import com.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/attendence")
public class AttendenceController {

    @Autowired
    AttendenceService attendenceService;


    private static final Logger logger = LoggerFactory.getLogger(AttendenceController.class);

    @GetMapping
    public List<Attendence> getAttendence() {
        logger.info("Attendence List");
        return attendenceService.getAttendence();
    }

    @PostMapping("/create")
    public Attendence create(@RequestBody Attendence attendence) {
        logger.info("create Attendence is invoked{}", attendence);
        return attendenceService.create(attendence);
    }
    @GetMapping("/date")
    public Attendence getAttendenceByDate(@PathVariable("date")String date)
    {
        logger.info("get Attendence is invoked {}");
        return attendenceService.getAttendenceByDate(date);
    }
    @PutMapping("/update")
    public Attendence updateStudent(@RequestBody Attendence attendence)
    {
        logger.info("update Attendence is invoked {}");
        return attendenceService.updateAttendence(attendence);
    }
    @DeleteMapping("/date")
    public Attendence deleteAttendence(@PathVariable("date") String date)
    {
        logger.info("delete Attendence is invoked {}");
        return attendenceService.deleteAttendence(date);
    }
}
