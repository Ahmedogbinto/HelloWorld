package com.udemy.decouvertejava.demonstration;

public class Port
{
    void accueilleEngin(com.udemy.decouvertejava.demonstration.transport.Amarable amarable)
    {
        if ( amarable instanceof com.udemy.decouvertejava.demonstration.transport.Amarable)
            System.out.println(" Il sagit bien dun amarable");

        int nbCordes = amarable.combienDeCorde(50);
        System.out.println("Le nombre de cordes necessaires est de " +nbCordes);
    }
}
