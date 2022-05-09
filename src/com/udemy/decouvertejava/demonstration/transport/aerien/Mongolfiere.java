package com.udemy.decouvertejava.demonstration.transport.aerien;

import com.udemy.decouvertejava.demonstration.transport.Amarable;

public class Mongolfiere implements Amarable
{
    int surface;
    @Override
    public int combienDeCorde(int vitesseDuVent)
    {
        int nbCordes = surface/50;
        nbCordes=nbCordes+vitesseDuVent/100;
        return nbCordes;
    }

    @Override
    public int combienDeCordes(int vitesseDuVent) {
        return 0;
    }
}


