package org.scriptobi.openschoolapi.model.DTO;

import org.scriptobi.openschoolapi.model.entities.Course;

import java.util.List;

public class TeacherDTO {
    private String firstname;
    private String lastname;
    private List<Course> courses;

    public TeacherDTO() {}

    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public List<Course> getCourses() { return courses; }
}
