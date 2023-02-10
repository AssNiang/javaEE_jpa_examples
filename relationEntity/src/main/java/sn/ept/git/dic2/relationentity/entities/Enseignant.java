/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.relationentity.entities;

import java.io.Serializable;
import javax.persistence.Entity;
/**
 *
 * @author LENOVO
 */
@Entity
public class Enseignant extends Personne implements Serializable {

    private String matiere;

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    
}
