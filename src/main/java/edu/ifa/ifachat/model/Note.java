package edu.ifa.ifachat.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Note {

    @Id
    private int id;
    private String contenu;

    @ManyToOne // cardinalité 1,n Plusieurs notes associés à un seul utilisateur
    private Utilisateur editeur;

    @JsonIgnore // qd on recupère les msg ds la bdd, on ignore le champ "salon" sinon boucle "salon" infini
    @ManyToOne // cardinalité 1,n Un salon peut contenir plusieurs messages
//    private BlocNote blocNote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Utilisateur getEditeur() {
        return editeur;
    }

    public void setEditeur(Utilisateur editeur) {
        this.editeur = editeur;
    }

}
