package org.scriptobi.openschoolapi.model.services;

import org.scriptobi.openschoolapi.model.entities.Course;
import org.scriptobi.openschoolapi.model.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CourseService")
public class CourseService {
    @Autowired
    private CourseRepository courseRepo;

    public Course findCourse(Integer id) {
        return courseRepo.findById(id).get();
    }

    public List<Course> findAllCourses() { return courseRepo.findAll(); }

    public void deleteCourse(Integer id) { courseRepo.deleteById(id); }
    public Course saveNewCourse(Course course) { return courseRepo.save(course); }
}
