package org.scriptobi.openschoolapi.model.repositories;

import org.scriptobi.openschoolapi.model.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    @Query(value = "SELECT t.teacherId, t.firstname, t.lastname FROM Teacher t")
    List<String> findAllTeachers();

    @Query("SELECT t.teacherId, t.firstname, t.lastname FROM Teacher t WHERE t.teacherId = :id")
    String findTeacher(@Param("id") Integer id);
}
