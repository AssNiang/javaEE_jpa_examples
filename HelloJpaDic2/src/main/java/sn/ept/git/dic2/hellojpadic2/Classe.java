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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "classe")
@NamedQueries({
    @NamedQuery(name = "Classe.findAll", query = "SELECT c FROM Classe c"),
    @NamedQuery(name = "Classe.findByNumClasse", query = "SELECT c FROM Classe c WHERE c.numClasse = :numClasse"),
    @NamedQuery(name = "Classe.findByNomClasse", query = "SELECT c FROM Classe c WHERE c.nomClasse = :nomClasse")})
public class Classe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_classe")
    private Integer numClasse;
    @Column(name = "nom_classe")
    private String nomClasse;
    @JoinColumn(name = "num_prof", referencedColumnName = "num_prof")
    @ManyToOne
    private Professeur numProf;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classe")
    private Collection<Enseigner> enseignerCollection;

    public Classe() {
    }

    public Classe(Integer numClasse) {
        this.numClasse = numClasse;
    }

    public Integer getNumClasse() {
        return numClasse;
    }

    public void setNumClasse(Integer numClasse) {
        this.numClasse = numClasse;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public Professeur getNumProf() {
        return numProf;
    }

    public void setNumProf(Professeur numProf) {
        this.numProf = numProf;
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
        hash += (numClasse != null ? numClasse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classe)) {
            return false;
        }
        Classe other = (Classe) object;
        if ((this.numClasse == null && other.numClasse != null) || (this.numClasse != null && !this.numClasse.equals(other.numClasse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.ept.git.dic2.hellojpadic2.Classe[ numClasse=" + numClasse + " ]";
    }
    
}
