package edu.ifa.blocnote.controller;

import edu.ifa.blocnote.dao.UtilisateurDao;
import edu.ifa.blocnote.model.Note;
import edu.ifa.blocnote.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin // permet un accès même depuis un domaine autre que localhost (desktop par exemple)
@RestController  // ou @Controller mais ici API Rest
public class UtilisateurController {

    private UtilisateurDao utilisateurDao;

    @Autowired
    public UtilisateurController(UtilisateurDao utilisateurDao) {

        this.utilisateurDao = utilisateurDao;
    }

    @GetMapping("/utilisateur/{id}")

    public Utilisateur getUtilisateur(@PathVariable int id) {

        return utilisateurDao.findById(id).orElse(null);
    }


}
