package com.security.SpringSecEx.controller;

import com.security.SpringSecEx.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Gathsara
 * created : 3/4/2025 -- 3:27 PM
 **/

@RestController
@RequestMapping("/student")
public class StudentController {

    // In-memory list to store student data
    private final List<Student> students = new ArrayList<>();

    // Constructor to add some initial students
    public StudentController() {
        students.add(new Student(1, "Alice", 85));
        students.add(new Student(2, "Bob", 92));
        students.add(new Student(3, "Charlie", 78));
    }

    // Get All Students
    @GetMapping("/get-all")
    public List<Student> getAllStudents() {
        return students;
    }

    // Save a Student
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student studentDTO) {
        students.add(studentDTO);
        return studentDTO;
    }

    //get csrf token
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
