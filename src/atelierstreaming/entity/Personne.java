/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierstreaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Formation
 */
@Entity
public class Personne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    
     @ManyToMany(mappedBy = "realisateur")
    List<Film>filmrealisateur = new ArrayList<Film>();
     
     @ManyToMany(mappedBy = "realisateur")
    List<Serie>serierealisateur = new ArrayList<Serie>();
     
     @ManyToMany(mappedBy = "realisateur")
    List<Episode>episoderealisateur = new ArrayList<Episode>();
     
      @ManyToMany(mappedBy = "acteur")
    List<Film>filmacteur = new ArrayList<Film>();
      
       @ManyToMany(mappedBy = "acteur")
    List<Serie>serieacteur = new ArrayList<Serie>();
       
        @ManyToMany(mappedBy = "acteur")
    List<Episode>episodeacateur= new ArrayList<Episode>();
      
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "atelierstreaming.entity.Personne[ id=" + id + " ]";
    }
    
}
