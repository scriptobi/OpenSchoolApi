package org.scriptobi.openschoolapi.model.repositories;

import org.scriptobi.openschoolapi.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
