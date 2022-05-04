package com.udemy.decouvertejava.demonstration;

public class Port
{
    void accueilleEngin(Amarable amarable)
    {
        if ( amarable instanceof Amarable)
            System.out.println(" Il sagit bien dun amarable");

        int nbCordes = amarable.combienDeCorde(50);
        System.out.println("Le nombre de cordes necessaires est de " +nbCordes);
    }
}
