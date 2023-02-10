/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sn.ept.git.dic2.hellojpadic2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author LENOVO
 */
public class HelloJpaDic2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloJPA_PU");
        EntityManager em = emf.createEntityManager();
        
        Eleve e1 = new Eleve();
        e1.setNom("NIANG");
        e1.setPrenom("Ass");
        e1.setAge(52);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(e1);
        tx.commit();
        
        em.close();
        emf.close();
    }
}
