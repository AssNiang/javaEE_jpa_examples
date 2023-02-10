/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.hellojpadic2;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "matiere")
@NamedQueries({
    @NamedQuery(name = "Matiere.findAll", query = "SELECT m FROM Matiere m"),
    @NamedQuery(name = "Matiere.findByNumMatiere", query = "SELECT m FROM Matiere m WHERE m.numMatiere = :numMatiere"),
    @NamedQuery(name = "Matiere.findByLibelle", query = "SELECT m FROM Matiere m WHERE m.libelle = :libelle"),
    @NamedQuery(name = "Matiere.findByQutoHoraire", query = "SELECT m FROM Matiere m WHERE m.qutoHoraire = :qutoHoraire")})
public class Matiere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_matiere")
    private Integer numMatiere;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "quto_horaire")
    private Integer qutoHoraire;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matiere")
    private Collection<Enseigner> enseignerCollection;

    public Matiere() {
    }

    public Matiere(Integer numMatiere) {
        this.numMatiere = numMatiere;
    }

    public Integer getNumMatiere() {
        return numMatiere;
    }

    public void setNumMatiere(Integer numMatiere) {
        this.numMatiere = numMatiere;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getQutoHoraire() {
        return qutoHoraire;
    }

    public void setQutoHoraire(Integer qutoHoraire) {
        this.qutoHoraire = qutoHoraire;
    }

    public Collection<Enseigner> getEnseignerCollection() {
        return enseignerCollection;
    }

    public void setEnseignerCollection(Collection<Enseigner> enseignerCollection) {
        this.enseignerCollection = enseignerCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numMatiere != null ? numMatiere.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matiere)) {
            return false;
        }
        Matiere other = (Matiere) object;
        if ((this.numMatiere == null && other.numMatiere != null) || (this.numMatiere != null && !this.numMatiere.equals(other.numMatiere))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.ept.git.dic2.hellojpadic2.Matiere[ numMatiere=" + numMatiere + " ]";
    }
    
}
