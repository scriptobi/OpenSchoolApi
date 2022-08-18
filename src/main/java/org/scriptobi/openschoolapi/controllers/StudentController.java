package org.scriptobi.openschoolapi.controllers;

import org.scriptobi.openschoolapi.model.DTO.StudentDTO;
import org.scriptobi.openschoolapi.model.entities.Student;
import org.scriptobi.openschoolapi.model.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public Iterable<StudentDTO> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(Integer id) { return studentService.getStudent(id).get(); }

    @PostMapping("/new")
    public Student saveStudent(String firstname, String lastname) {
        return studentService.saveStudent(new Student(firstname, lastname));
    }
}
