/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.hellojpadic2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author LENOVO
 */
@Embeddable
public class EnseignerPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "num_prof")
    private int numProf;
    @Basic(optional = false)
    @Column(name = "num_classe")
    private int numClasse;
    @Basic(optional = false)
    @Column(name = "num_matiere")
    private int numMatiere;

    public EnseignerPK() {
    }

    public EnseignerPK(int numProf, int numClasse, int numMatiere) {
        this.numProf = numProf;
        this.numClasse = numClasse;
        this.numMatiere = numMatiere;
    }

    public int getNumProf() {
        return numProf;
    }

    public void setNumProf(int numProf) {
        this.numProf = numProf;
    }

    public int getNumClasse() {
        return numClasse;
    }

    public void setNumClasse(int numClasse) {
        this.numClasse = numClasse;
    }

    public int getNumMatiere() {
        return numMatiere;
    }

    public void setNumMatiere(int numMatiere) {
        this.numMatiere = numMatiere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numProf;
        hash += (int) numClasse;
        hash += (int) numMatiere;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnseignerPK)) {
            return false;
        }
        EnseignerPK other = (EnseignerPK) object;
        if (this.numProf != other.numProf) {
            return false;
        }
        if (this.numClasse != other.numClasse) {
            return false;
        }
        if (this.numMatiere != other.numMatiere) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.ept.git.dic2.hellojpadic2.EnseignerPK[ numProf=" + numProf + ", numClasse=" + numClasse + ", numMatiere=" + numMatiere + " ]";
    }
    
}
