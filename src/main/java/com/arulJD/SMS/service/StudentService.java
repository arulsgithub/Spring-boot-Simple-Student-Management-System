package com.arulJD.SMS.service;

import com.arulJD.SMS.entity.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);
    List<Student> getAllStudents();
}
