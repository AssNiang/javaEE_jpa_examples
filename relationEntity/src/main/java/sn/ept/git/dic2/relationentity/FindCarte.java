/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.relationentity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import sn.ept.git.dic2.relationentity.entities.CarteId;
import sn.ept.git.dic2.relationentity.entities.carteEleve;

/**
 *
 * @author LENOVO
 */
public class FindCarte {
    private static final String PU_NAME = "relationEntityPU";
    public static void main(String[] args) {
        CarteId id = new CarteId(350l, 2023);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        carteEleve carte = em.find(carteEleve.class, id);
        
        System.out.println(carte);
        
        em.close();
        emf.close();
    }
}
