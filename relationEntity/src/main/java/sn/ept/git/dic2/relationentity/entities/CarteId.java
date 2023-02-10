/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.relationentity.entities;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class CarteId implements Serializable{
    private Long numero;
    private Integer annee;

    public CarteId() {
    }

    public CarteId(Long numero, Integer annee) {
        this.numero = numero;
        this.annee = annee;
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
    
    
}
