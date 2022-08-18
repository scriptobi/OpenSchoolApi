package org.scriptobi.openschoolapi.model.repositories;

import org.scriptobi.openschoolapi.model.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Integer> {
}
