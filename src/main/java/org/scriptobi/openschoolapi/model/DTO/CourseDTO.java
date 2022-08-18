package org.scriptobi.openschoolapi.model.DTO;

import org.scriptobi.openschoolapi.model.entities.Course;

public class CourseDTO {
    private Integer id;
    private String name;

    public CourseDTO() {}
    public CourseDTO(Course course) {
        id = course.getId();
        name = course.getName();
    }
}
