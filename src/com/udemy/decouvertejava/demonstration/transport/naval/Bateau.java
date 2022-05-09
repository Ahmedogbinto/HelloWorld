package com.udemy.decouvertejava.demonstration.transport.naval;

import com.udemy.decouvertejava.demonstration.transport.Amarable;

public class Bateau implements Amarable
{
    int masse;

    @Override
    public int combienDeCorde(int vitesseDuVent)
    {
        int nbCordes=masse/10;
        return nbCordes;
    }

    @Override
    public int combienDeCordes(int vitesseDuVent) {
        return 0;
    }
}
