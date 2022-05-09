package com.udemy.decouvertejava.demonstration.transport.terrestre;


import com.udemy.decouvertejava.demonstration.transport.UsineDassemblage;

import com.udemy.decouvertejava.demonstration.transport.VehiculeAMoteur;


public class UsineDassemblageVoiture extends UsineDassemblage
{
    public Voiture assemble(){
        Voiture v = new Voiture();

        try {
            v.immatriculer("AA 123 AA");
            System.out.println("Tout s'est bien passe");
        }
        catch (NombreDeCaractereInvalidExecption ex){
            System.out.println("Attention, un probleme est survenu");
        }

        Voiture peindre(VehiculeAMoteur vam){
            System.out.println("Je pain le vam");
            return vam;
        }
    }
}
