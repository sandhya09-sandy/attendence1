package com.services;

import com.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();

    Student create(Student student);

    Student getStudentById(int id);

    Student updateStudent(Student student);

    Student deleteStudent(int id);
    //List<Student> getStudentByAdmin(int id);
}
