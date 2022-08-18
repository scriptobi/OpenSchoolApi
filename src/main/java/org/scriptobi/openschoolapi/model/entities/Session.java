package org.scriptobi.openschoolapi.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sessions")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id")
    private Integer sessionId;

    @Column(name = "session_name")
    private String sessionName;

    @ManyToMany
    @JoinTable(name = "students4sessions",
            joinColumns = @JoinColumn(name = "session_fk", referencedColumnName = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "student_fk", referencedColumnName = "student_id")
    )
    private Set<Student> students;

    public Session() {}
    public Session(String sessionName) {
        this.sessionName = sessionName;
    }

    public Integer getId() { return sessionId; }
    public String getSessionName() { return sessionName; }
    public void setSessionName(String sessionName) { this.sessionName = sessionName; }
    public Set<Student> getStudents() { return students; }
}
