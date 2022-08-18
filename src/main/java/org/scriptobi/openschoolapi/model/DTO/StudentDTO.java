package org.scriptobi.openschoolapi.model.DTO;

import org.scriptobi.openschoolapi.model.entities.Session;
import org.scriptobi.openschoolapi.model.entities.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentDTO {
    private String firstname;
    private String lastname;
    private List<SessionDTO> sessions = new ArrayList<>();

    public StudentDTO() {}
    public StudentDTO(Student student) {
        this.firstname = student.getFirstname();
        this.lastname = student.getLastname();
        for (Session session : student.getSessions()) {
            SessionDTO sessionDTO = new SessionDTO(session.getSessionName());
            sessions.add(sessionDTO);
        }
    }
    public StudentDTO(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() { return firstname; }
    public String getLastname() { return  lastname; }
    public List<SessionDTO> getSessions() { return sessions; }
}
