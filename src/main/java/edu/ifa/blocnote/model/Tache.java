package edu.ifa.blocnote.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Tache {

    @Id
    private int id;
    private String matache;
    private Boolean statut;

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }

    @JsonIgnore
    @ManyToOne // cardinalité 1,n Plusieurs tâches associés à une seule liste
    private Liste maListe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatache() {
        return matache;
    }

    public void setMatache(String matache) {
        this.matache = matache;
    }

    public Liste getMaListe() {
        return maListe;
    }

    public void setMaListe(Liste maListe) {
        this.maListe = maListe;
    }

}
