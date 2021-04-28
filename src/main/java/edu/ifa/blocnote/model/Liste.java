package edu.ifa.blocnote.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Liste {

    @Id
    private int id;

    @OneToMany(mappedBy = "maListe")
    private List<Tache> listeTaches;

    @JsonIgnore
    @ManyToOne // cardinalité 1,n Plusieurs listes associées à un seul utilisateur
    private Utilisateur editeur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Tache> getListeTaches() {
        return listeTaches;
    }

    public void setListeTaches(List<Tache> listeTaches) {
        this.listeTaches = listeTaches;
    }

    public Utilisateur getEditeur() {
        return editeur;
    }

    public void setEditeur(Utilisateur editeur) {
        this.editeur = editeur;
    }
}
