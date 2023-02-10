/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.hellojpadic2;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "enseigner")
@NamedQueries({
    @NamedQuery(name = "Enseigner.findAll", query = "SELECT e FROM Enseigner e"),
    @NamedQuery(name = "Enseigner.findByNumProf", query = "SELECT e FROM Enseigner e WHERE e.enseignerPK.numProf = :numProf"),
    @NamedQuery(name = "Enseigner.findByNumClasse", query = "SELECT e FROM Enseigner e WHERE e.enseignerPK.numClasse = :numClasse"),
    @NamedQuery(name = "Enseigner.findByNumMatiere", query = "SELECT e FROM Enseigner e WHERE e.enseignerPK.numMatiere = :numMatiere")})
public class Enseigner implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EnseignerPK enseignerPK;
    @JoinColumn(name = "num_classe", referencedColumnName = "num_classe", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Classe classe;
    @JoinColumn(name = "num_matiere", referencedColumnName = "num_matiere", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Matiere matiere;
    @JoinColumn(name = "num_prof", referencedColumnName = "num_prof", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Professeur professeur;

    public Enseigner() {
    }

    public Enseigner(EnseignerPK enseignerPK) {
        this.enseignerPK = enseignerPK;
    }

    public Enseigner(int numProf, int numClasse, int numMatiere) {
        this.enseignerPK = new EnseignerPK(numProf, numClasse, numMatiere);
    }

    public EnseignerPK getEnseignerPK() {
        return enseignerPK;
    }

    public void setEnseignerPK(EnseignerPK enseignerPK) {
        this.enseignerPK = enseignerPK;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enseignerPK != null ? enseignerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enseigner)) {
            return false;
        }
        Enseigner other = (Enseigner) object;
        if ((this.enseignerPK == null && other.enseignerPK != null) || (this.enseignerPK != null && !this.enseignerPK.equals(other.enseignerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.ept.git.dic2.hellojpadic2.Enseigner[ enseignerPK=" + enseignerPK + " ]";
    }
    
}
