/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.relationentity;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sn.ept.git.dic2.relationentity.entities.CarteId;
import sn.ept.git.dic2.relationentity.entities.Eleve;
import sn.ept.git.dic2.relationentity.entities.carteEleve;

/**
 *
 * @author LENOVO
 */
public class ListeEleves {
    private static final String PU_NAME = "relationEntityPU";
    public static void main(String[] args) {
        CarteId id = new CarteId(350l, 2023);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        Query requete = em.createQuery("SELECT e FROM Eleve e WHERE e.id=:idEleve");
        requete.setParameter("idEleve", 1l);
        List<Eleve> listeEleves = requete.getResultList();
        System.out.println("Eleve = " + listeEleves);
        
        em.close();
        emf.close();
    }
}
