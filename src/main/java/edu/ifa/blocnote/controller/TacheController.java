package edu.ifa.blocnote.controller;

import edu.ifa.blocnote.dao.TacheDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin // permet un accès même depuis un domaine autre que localhost (desktop par exemple)
@RestController  // ou @Controller mais ici API Rest
public class TacheController {

    private TacheDao tacheDao;

    @Autowired
    public TacheController(TacheDao tacheDao) {

        this.tacheDao = tacheDao;
    }

    @GetMapping("/supprimer_tache/{id}")

    public void getTache(@PathVariable int id) {

        tacheDao.deleteById(id);

    }
}
