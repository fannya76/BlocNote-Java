package edu.ifa.blocnote.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Utilisateur {

    @Id
    private int id;
    private String pseudo;
    private String motDePasse;

    @OneToMany(mappedBy = "editeur")
    private List<Note> listeNotes;

    @OneToMany(mappedBy = "editeur")
    private List<Liste> listeListes;

    public List<Liste> getListeListes() {
        return listeListes;
    }

    public void setListeListes(List<Liste> listeListes) {
        this.listeListes = listeListes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public List<Note> getListeNotes() {
        return listeNotes;
    }

    public void setListeNotes(List<Note> listeNotes) {
        this.listeNotes = listeNotes;
    }
}
