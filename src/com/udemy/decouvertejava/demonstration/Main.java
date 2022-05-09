package com.udemy.decouvertejava.demonstration;

import com.udemy.decouvertejava.demonstration.transport.terrestre.Voiture;
import com.udemy.decouvertejava.demonstration.transport.UsineDassemblage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

      UsineDassemblage uav = new UsineDassemblage();
      uav.assembler();


        System.out.println(" Le nombre Pi vaut "+Math.PI);

        Voiture peugeot207 = new Voiture();
        peugeot207.setCouleur("Rouge");

        Voiture peugeot206 = new Voiture();
        peugeot206.setCouleur("Rouge");

        Voiture peugeot307 = new Voiture();
        peugeot307.setCouleur("Rouge");


        List<Carre> listeCarre = new ArrayList();
        listeCarre.add (new Carre(101));
        listeCarre.add (new Carre(184));
        listeCarre.add (new Carre(46));
        listeCarre.add (new Carre(21));

        Collections.sort(listeCarre);
        for (Carre carre:listeCarre){
            System.out.print(carre.cote);
        }











    }


}


