package edu.ifa.ifachat.dao;

import edu.ifa.ifachat.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao extends JpaRepository<Note, Integer> {
}
