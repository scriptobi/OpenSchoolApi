package org.scriptobi.openschoolapi.model.services;

import org.scriptobi.openschoolapi.model.entities.Teacher;
import org.scriptobi.openschoolapi.model.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("TeacherService")
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepo;

    public Teacher findTeacher(Integer id) {
        String[] split = teacherRepo.findTeacher(id).split(",");
        Teacher t = new Teacher(id, split[1], split[2]);
        return t;
    }
    public Teacher findById(Integer id) {
        return teacherRepo.findById(id).get();
    }

    public List<Teacher> getTeachers() {
        List<Teacher> res = new ArrayList<>();
        List<String> lst = teacherRepo.findAllTeachers();
        for (String str: lst) {
            String[] split = str.split(",");
            Teacher t = new Teacher(
                    Integer.parseInt(split[0]),
                    split[1],
                    split[2]
            );
            res.add(t);
        }
        return res;
    }
    public List<Teacher> findAllTeachers() { return teacherRepo.findAll(); }

    public void deleteTeacher(Integer id) {
        teacherRepo.deleteById(id);
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }
}
