/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.hellojpadic2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "vendeurs")
@NamedQueries({
    @NamedQuery(name = "Vendeurs.findAll", query = "SELECT v FROM Vendeurs v"),
    @NamedQuery(name = "Vendeurs.findByNv", query = "SELECT v FROM Vendeurs v WHERE v.nv = :nv"),
    @NamedQuery(name = "Vendeurs.findByNomv", query = "SELECT v FROM Vendeurs v WHERE v.nomv = :nomv"),
    @NamedQuery(name = "Vendeurs.findByVille", query = "SELECT v FROM Vendeurs v WHERE v.ville = :ville")})
public class Vendeurs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NV")
    private Integer nv;
    @Column(name = "NOMV")
    private String nomv;
    @Column(name = "VILLE")
    private String ville;

    public Vendeurs() {
    }

    public Vendeurs(Integer nv) {
        this.nv = nv;
    }

    public Integer getNv() {
        return nv;
    }

    public void setNv(Integer nv) {
        this.nv = nv;
    }

    public String getNomv() {
        return nomv;
    }

    public void setNomv(String nomv) {
        this.nomv = nomv;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nv != null ? nv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendeurs)) {
            return false;
        }
        Vendeurs other = (Vendeurs) object;
        if ((this.nv == null && other.nv != null) || (this.nv != null && !this.nv.equals(other.nv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.ept.git.dic2.hellojpadic2.Vendeurs[ nv=" + nv + " ]";
    }
    
}
