package org.scriptobi.openschoolapi.model.repositories;

import org.scriptobi.openschoolapi.model.entities.Course;
import org.scriptobi.openschoolapi.model.entities.relations.Course4Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Course4TeacherRepository extends JpaRepository<Course4Teacher, Integer> {
    List<Course4Teacher> findByTeacher(Integer id);
}
