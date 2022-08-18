package org.scriptobi.openschoolapi.controllers;

import org.scriptobi.openschoolapi.model.entities.Course;
import org.scriptobi.openschoolapi.model.entities.Teacher;
import org.scriptobi.openschoolapi.model.services.Course4TeacherService;
import org.scriptobi.openschoolapi.model.services.TeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(path = "/teacher")
public class TeacherController {
    @Resource(name = "TeacherService")
    private TeacherService teacherService;
    //@Resource(name ="Course4TeacherService")
    //private Course4TeacherService c4tService;

    @GetMapping("")
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
        //return teacherService.findAllTeachers();
    }

    @GetMapping("/{id}")
    public Teacher getTeacher(Integer id) {
        //Teacher teacher = teacherService.findTeacher(id);
        //List<Course> courses = c4tService.getCourses4Teacher(id);
        Teacher teacher = teacherService.findById(id);
        return teacher;
    }

    @PostMapping("/new")
    public Teacher addNewTeacher(String firstname, String lastname) {
        Teacher t = new Teacher(firstname, lastname);
        return teacherService.saveTeacher(t);
    }

    @GetMapping("/remove/{id}")
    public void removeTeacher(Integer id) {
        teacherService.deleteTeacher(id);
    }
}
