/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.relationentity.entities;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author LENOVO
 */
@Entity
//@DiscriminatorValue(value = "Eleve_Ingenieur")
public class Eleve extends Personne implements Serializable {

    private static final long serialVersionUID = 1L;
        
//    @JoinColumn(name = "NUMERO_CARTE")
    @OneToOne
    private carteEleve carte;
    
    @ManyToOne
    private Formation formation;
   
    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Eleve() {
    }

    public Eleve(String prenom, String nom) {
        super(prenom, nom);
    }
    
    

    public carteEleve getCarte() {
        return carte;
    }

    public void setCarte(carteEleve carte) {
        this.carte = carte;
    }

    @Override
    public String toString() {
        return "Eleve{" + super.toString() + ',' + "carte=" + carte + ", formation=" + formation + '}';
    }

   
    
    
}
