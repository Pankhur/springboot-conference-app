package com.pluralsight.conference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pluralsight.conference.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
