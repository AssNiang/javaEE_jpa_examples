/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sn.ept.git.dic2.relationentity;


import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import sn.ept.git.dic2.relationentity.entities.Eleve;
import sn.ept.git.dic2.relationentity.entities.Formation;
import sn.ept.git.dic2.relationentity.entities.Personne;
import sn.ept.git.dic2.relationentity.entities.carteEleve;

/**
 *
 * @author LENOVO
 */
public class RelationEntity {
    private static final String PU_NAME = "relationEntityPU";

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PU_NAME);
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        Eleve e = new Eleve("Ndeye Awa", "SALANE");
        Eleve e2 = new Eleve("Fallou", "MBENGUE");      
        carteEleve c = new carteEleve(350l, 2023, new Date());
        Formation f = new Formation("dic2", "GIT DIC2");
        Formation f2 = new Formation("dic1", "GIT DIC1");
        Formation f3 = new Formation("dic3");
        Personne p1 = new Personne("Bintou", "NGOM");
        
        em.persist(c);
        em.persist(f);
        em.persist(f2);
        em.persist(f3);
        em.persist(p1);
        
        e.setCarte(c);
        e.setFormation(f);
        
        e2.setFormation(f2);
        
        em.persist(e);
        em.persist(e2);
        
        tx.commit();
        
        em.close();
        emf.close();
    }
}
