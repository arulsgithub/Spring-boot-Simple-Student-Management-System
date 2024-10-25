package com.arulJD.SMS.controller;

import com.arulJD.SMS.entity.Student;
import com.arulJD.SMS.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

//    public ResponseEntity<Student> saveStudent(Student student){
//
//        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
//    }

    @GetMapping("/students")
    public String listAllStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/add")
    public String addStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);

        return "addStudent";
    }
}
