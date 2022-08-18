package org.scriptobi.openschoolapi.model.repositories;

import org.scriptobi.openschoolapi.model.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
