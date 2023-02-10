/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sn.ept.git.dic2.relationentity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import sn.ept.git.dic2.relationentity.entities.Eleve;

/**
 *
 * @author LENOVO
 */
public class FindEleveTest {
    private static final String PU_NAME = "relationEntityPU";

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        Long id = 1l;
      
        Eleve e = em.find(Eleve.class, id);
        System.out.println(e);
        
        em.close();
        emf.close();
    }
}
