package org.scriptobi.openschoolapi.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.scriptobi.openschoolapi.model.entities.relations.Course4Teacher;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id", nullable = false)
    private Integer teacherId;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.PERSIST)
    private List<Course4Teacher> c4t;

    public Teacher() {}
    public Teacher(Integer id, String firstname, String lastname) {
        this(firstname, lastname);
        this.teacherId = id;
    }
    public Teacher(String firstname, String lastname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public Integer getTeacherId() { return teacherId; }
    public void setTeacherId(Integer id) { teacherId = id; }
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public List<Course4Teacher> getCourses4Teacher() { return c4t; }
    public void setCourses4Teacher(List<Course4Teacher> list) { c4t = list; }
}
