package com.udemy.decouvertejava.demonstration.transport;

/**
 *
 */
public class UsineDassemblage
{
    /**
     *
     * @return
     */
    public VehiculeAMoteur assembler()
    {
        /*
        Il s'agit d'une classe nous permettant d'instancier
        un vehiculAmoteur avec un moteur par defaut. On ne sait pas s'il s'agit
        d'un moteur a essence ou un moteur diesel.
         */
        Moteur moteur = new Moteur();
        VehiculeAMoteur vam = new VehiculeAMoteur();
         return  vam;
    }
}
