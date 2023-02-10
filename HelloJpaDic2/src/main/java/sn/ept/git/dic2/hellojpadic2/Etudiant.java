/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.hellojpadic2;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "etudiant")
@NamedQueries({
    @NamedQuery(name = "Etudiant.findAll", query = "SELECT e FROM Etudiant e"),
    @NamedQuery(name = "Etudiant.findByNumEtud", query = "SELECT e FROM Etudiant e WHERE e.numEtud = :numEtud"),
    @NamedQuery(name = "Etudiant.findByNomEtud", query = "SELECT e FROM Etudiant e WHERE e.nomEtud = :nomEtud"),
    @NamedQuery(name = "Etudiant.findByPrenomEtud", query = "SELECT e FROM Etudiant e WHERE e.prenomEtud = :prenomEtud"),
    @NamedQuery(name = "Etudiant.findByAdresse", query = "SELECT e FROM Etudiant e WHERE e.adresse = :adresse"),
    @NamedQuery(name = "Etudiant.findByVille", query = "SELECT e FROM Etudiant e WHERE e.ville = :ville"),
    @NamedQuery(name = "Etudiant.findByTelephoneEtud", query = "SELECT e FROM Etudiant e WHERE e.telephoneEtud = :telephoneEtud"),
    @NamedQuery(name = "Etudiant.findByEmailEtud", query = "SELECT e FROM Etudiant e WHERE e.emailEtud = :emailEtud"),
    @NamedQuery(name = "Etudiant.findByAge", query = "SELECT e FROM Etudiant e WHERE e.age = :age")})
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "num_etud")
    private Integer numEtud;
    @Column(name = "nom_etud")
    private String nomEtud;
    @Column(name = "prenom_etud")
    private String prenomEtud;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "ville")
    private String ville;
    @Column(name = "telephone_etud")
    private String telephoneEtud;
    @Column(name = "email_etud")
    private String emailEtud;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @OneToMany(mappedBy = "numClasse")
    private Collection<Etudiant> etudiantCollection;
    @JoinColumn(name = "num_classe", referencedColumnName = "num_etud")
    @ManyToOne
    private Etudiant numClasse;

    public Etudiant() {
    }

    public Etudiant(Integer numEtud) {
        this.numEtud = numEtud;
    }

    public Etudiant(Integer numEtud, int age) {
        this.numEtud = numEtud;
        this.age = age;
    }

    public Integer getNumEtud() {
        return numEtud;
    }

    public void setNumEtud(Integer numEtud) {
        this.numEtud = numEtud;
    }

    public String getNomEtud() {
        return nomEtud;
    }

    public void setNomEtud(String nomEtud) {
        this.nomEtud = nomEtud;
    }

    public String getPrenomEtud() {
        return prenomEtud;
    }

    public void setPrenomEtud(String prenomEtud) {
        this.prenomEtud = prenomEtud;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephoneEtud() {
        return telephoneEtud;
    }

    public void setTelephoneEtud(String telephoneEtud) {
        this.telephoneEtud = telephoneEtud;
    }

    public String getEmailEtud() {
        return emailEtud;
    }

    public void setEmailEtud(String emailEtud) {
        this.emailEtud = emailEtud;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Collection<Etudiant> getEtudiantCollection() {
        return etudiantCollection;
    }

    public void setEtudiantCollection(Collection<Etudiant> etudiantCollection) {
        this.etudiantCollection = etudiantCollection;
    }

    public Etudiant getNumClasse() {
        return numClasse;
    }

    public void setNumClasse(Etudiant numClasse) {
        this.numClasse = numClasse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numEtud != null ? numEtud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.numEtud == null && other.numEtud != null) || (this.numEtud != null && !this.numEtud.equals(other.numEtud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.ept.git.dic2.hellojpadic2.Etudiant[ numEtud=" + numEtud + " ]";
    }
    
}
