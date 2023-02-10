/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.relationentity.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Temporal;

/**
 *
 * @author LENOVO
 */
@IdClass(CarteId.class)
@Entity
public class carteEleve implements Serializable {
    
    @Id
    private Long numero;
    
    @Id
    private Integer annee;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateInscription;

    public carteEleve() {
    }

    public carteEleve(Long numero, Integer annee, Date dateInscription) {
        this.numero = numero;
        this.annee = annee;
        this.dateInscription = dateInscription;
    }

   


    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    @Override
    public String toString() {
        return "carteEleve{" + "numero=" + numero + ", annee=" + annee + ", dateInscription=" + dateInscription + '}';
    }
    
    
}
