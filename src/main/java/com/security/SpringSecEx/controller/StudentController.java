package com.security.SpringSecEx.controller;

import com.security.SpringSecEx.dto.StudentDTO;
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
    private final List<StudentDTO> students = new ArrayList<>();

    // Constructor to add some initial students
    public StudentController() {
        students.add(new StudentDTO(1, "Alice", 85));
        students.add(new StudentDTO(2, "Bob", 92));
        students.add(new StudentDTO(3, "Charlie", 78));
    }

    // Get All Students
    @GetMapping("/get-all")
    public List<StudentDTO> getAllStudents() {
        return students;
    }

    // Save a Student
    @PostMapping("/save")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO) {
        students.add(studentDTO);
        return studentDTO;
    }
}
