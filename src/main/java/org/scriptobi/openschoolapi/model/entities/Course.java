package org.scriptobi.openschoolapi.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.scriptobi.openschoolapi.model.entities.relations.Course4Teacher;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id", nullable = false)
    private Integer courseId;

    @Column(name = "course_name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "course")
    private Set<Course4Teacher> c4t;

    public Course() {}
    public Course(String name) {
        this.name = name;
    }

    public Integer getId() { return courseId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Set<Course4Teacher> getTeachers4course() { return c4t; }
}
