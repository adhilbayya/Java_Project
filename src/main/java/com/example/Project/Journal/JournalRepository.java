package com.example.Project.Journal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JournalRepository extends JpaRepository<Journal, Long> {
    @Query("select j from Journal j where j.userID = ?1")
    List<Journal> findByUserID(String userID);
}
