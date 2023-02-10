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
@Table(name = "professeur")
@NamedQueries({
    @NamedQuery(name = "Professeur.findAll", query = "SELECT p FROM Professeur p"),
    @NamedQuery(name = "Professeur.findByNumProf", query = "SELECT p FROM Professeur p WHERE p.numProf = :numProf"),
    @NamedQuery(name = "Professeur.findByNomProf", query = "SELECT p FROM Professeur p WHERE p.nomProf = :nomProf"),
    @NamedQuery(name = "Professeur.findByPrenomProf", query = "SELECT p FROM Professeur p WHERE p.prenomProf = :prenomProf"),
    @NamedQuery(name = "Professeur.findByTelephoneProf", query = "SELECT p FROM Professeur p WHERE p.telephoneProf = :telephoneProf"),
    @NamedQuery(name = "Professeur.findByEmailProf", query = "SELECT p FROM Professeur p WHERE p.emailProf = :emailProf")})
public class Professeur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_prof")
    private Integer numProf;
    @Column(name = "nom_prof")
    private String nomProf;
    @Column(name = "prenom_prof")
    private String prenomProf;
    @Column(name = "telephone_prof")
    private String telephoneProf;
    @Column(name = "email_prof")
    private String emailProf;
    @OneToMany(mappedBy = "numProf")
    private Collection<Classe> classeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professeur")
    private Collection<Enseigner> enseignerCollection;

    public Professeur() {
    }

    public Professeur(Integer numProf) {
        this.numProf = numProf;
    }

    public Integer getNumProf() {
        return numProf;
    }

    public void setNumProf(Integer numProf) {
        this.numProf = numProf;
    }

    public String getNomProf() {
        return nomProf;
    }

    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }

    public String getPrenomProf() {
        return prenomProf;
    }

    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
    }

    public String getTelephoneProf() {
        return telephoneProf;
    }

    public void setTelephoneProf(String telephoneProf) {
        this.telephoneProf = telephoneProf;
    }

    public String getEmailProf() {
        return emailProf;
    }

    public void setEmailProf(String emailProf) {
        this.emailProf = emailProf;
    }

    public Collection<Classe> getClasseCollection() {
        return classeCollection;
    }

    public void setClasseCollection(Collection<Classe> classeCollection) {
        this.classeCollection = classeCollection;
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
        hash += (numProf != null ? numProf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professeur)) {
            return false;
        }
        Professeur other = (Professeur) object;
        if ((this.numProf == null && other.numProf != null) || (this.numProf != null && !this.numProf.equals(other.numProf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.ept.git.dic2.hellojpadic2.Professeur[ numProf=" + numProf + " ]";
    }
    
}
