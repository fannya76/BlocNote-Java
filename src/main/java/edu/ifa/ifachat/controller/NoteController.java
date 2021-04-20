package edu.ifa.ifachat.controller;

import edu.ifa.ifachat.dao.NoteDao;
import edu.ifa.ifachat.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin // permet un accès même depuis un domaine autre que localhost (desktop par exemple)
@RestController  // ou @Controller mais ici API Rest
public class NoteController {

    private NoteDao noteDao;

    @Autowired
    public NoteController(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    public List<Note> getListeNotes() {

        List<Note> listeNotes = noteDao.findAll();
        return listeNotes;
    }
}
