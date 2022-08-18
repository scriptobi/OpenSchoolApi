package org.scriptobi.openschoolapi.model.entities.relations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.scriptobi.openschoolapi.model.entities.Course;
import org.scriptobi.openschoolapi.model.entities.Teacher;

import javax.persistence.*;

@Entity
@Table(name = "courses4teachers")
public class Course4Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c4t_id", nullable = false)
    private Integer c4tId;

    @ManyToOne
    @JoinColumn(name = "course_fk")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "teacher_fk")
    private Teacher teacher;

    public Course4Teacher() {}
    public Course4Teacher(Course course, Teacher teacher) {
        this.course = course;
        this.teacher = teacher;
    }

    public Integer getC4tId() { return c4tId; }
    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }
    public Teacher getTeacher() { return teacher; }
    public void setTeacher(Teacher teacher) { this.teacher = teacher; }
}
