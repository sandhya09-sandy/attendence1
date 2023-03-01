package com.services;

import com.model.Attendence;
import com.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttendenceService {
    List<Attendence> getAttendence();

    Attendence create(Attendence attendence);

    Attendence getAttendenceByDate(String date);

    Attendence updateAttendence(Attendence attendence);

    Attendence deleteAttendence(String date);
   /* List<Attendence> getAttendenceByStudent(int id);
    List<Attendence> getAttendenceByTeacher(int id);*/
}

