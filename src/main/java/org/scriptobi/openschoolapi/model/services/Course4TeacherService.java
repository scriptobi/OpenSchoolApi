package org.scriptobi.openschoolapi.model.services;

import org.scriptobi.openschoolapi.model.entities.relations.Course4Teacher;
import org.scriptobi.openschoolapi.model.repositories.Course4TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Course4TeacherService")
public class Course4TeacherService {
    @Autowired
    private Course4TeacherRepository course4TeacherRepo;

    public List<Course4Teacher> getCourses4Teacher(Integer id) {
        List<Course4Teacher> c4t = course4TeacherRepo.findByTeacher(id);
        return c4t;
    }
}
