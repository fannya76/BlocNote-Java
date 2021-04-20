package edu.ifa.blocnote.dao;

import edu.ifa.blocnote.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao extends JpaRepository<Note, Integer> {
}
