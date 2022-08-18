package org.scriptobi.openschoolapi.model.services;

import org.scriptobi.openschoolapi.model.entities.Session;
import org.scriptobi.openschoolapi.model.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SessionService")
public class SessionService {
    @Autowired
    private SessionRepository sessionRepo;

    public List<Session> getSessions() { return sessionRepo.findAll(); }
}
