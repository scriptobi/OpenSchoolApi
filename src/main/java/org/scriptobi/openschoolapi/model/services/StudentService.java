package org.scriptobi.openschoolapi.model.services;

import org.scriptobi.openschoolapi.model.DTO.StudentDTO;
import org.scriptobi.openschoolapi.model.entities.Student;
import org.scriptobi.openschoolapi.model.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;

    public Optional<Student> getStudent(Integer id) {
        return studentRepo.findById(id);
    }

    public List<StudentDTO> getStudents() {
        List<Student> students = studentRepo.findAll();
        List<StudentDTO> studentDTOList = new ArrayList<>();
        for (Student student : students ) {
            StudentDTO studentDTO = new StudentDTO(student);
            studentDTOList.add(studentDTO);
        }
        return studentDTOList;
    }

    public void deleteStudent(Integer id) {
        studentRepo.deleteById(id);
    }

    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }
}
