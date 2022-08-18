package org.scriptobi.openschoolapi.model.DTO;

import org.scriptobi.openschoolapi.model.entities.Session;
import org.scriptobi.openschoolapi.model.entities.Student;

import java.util.HashSet;
import java.util.Set;

public class SessionDTO {
    private String name;
    private Set<StudentDTO> students = new HashSet<>();

    public SessionDTO() {}
    public SessionDTO(Session session) {
        name = session.getSessionName();
        for (Student student : session.getStudents()) {
            StudentDTO studentDTO = new StudentDTO(student.getFirstname(), student.getLastname());
            students.add(studentDTO);
        }
    }
    public SessionDTO(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public Set<StudentDTO> getStudents() { return students; }
}
