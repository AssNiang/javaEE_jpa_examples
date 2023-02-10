/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ept.git.dic2.relationentity;

import java.util.HashSet;
import java.util.Set;
import sn.ept.git.dic2.relationentity.entities.Eleve;

/**
 *
 * @author LENOVO
 */
public class TestCollection {
    public static void main(String[] args) {
        Eleve e1 = new Eleve("Ass", "NIANG");
        e1.setId(1l);
        Eleve e2 = new Eleve("Ass", "NIANG");
        e2.setId(1l);
        Set<Eleve> listeEleves = new HashSet<>();
        listeEleves.add(e1);
        listeEleves.add(e2);
        
        System.out.println("ListeEleves= " + listeEleves);
        System.out.println("NbreEleves= " + listeEleves.size());
    }
}
