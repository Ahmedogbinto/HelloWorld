
package com.udemy.decouvertejava.demonstration.transport.terrestre;

import com.udemy.decouvertejava.demonstration.transport.Moteur;
import com.udemy.decouvertejava.demonstration.transport.Passager;
import com.udemy.decouvertejava.demonstration.transport.TypeBoiteVitesse;
import com.udemy.decouvertejava.demonstration.transport.Vehicule;

import java.util.Objects;

public class Voiture extends Vehicule implements Vidangeable
{
    static int nbroue=4;
    static int nbPortes=5;
    TypeBoiteVitesse typeBoite;
    boolean automatique;
    Integer vitesseCourante;
    public String couleur;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voiture)) return false;
        Voiture voiture = (Voiture) o;
        return nbPortes == voiture.nbPortes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nbPortes);
    }


    public Voiture()
    {
      super(new Moteur());
    }
    Voiture(String couleur)
    {
        this();
        this.couleur=couleur;
        System.out.println("Une voiture est en construction avec couleur");
    }

    Voiture(String carburation, int nbCylindre)
    {
        Moteur moteur = new Moteur();
        moteur.carburation = carburation;
        moteur.nbCylindre = nbCylindre;
        this.moteur = moteur;
    }

    static void tourner(boolean droite, int angle)
    {
        String droiteOuGauche;
        if (droite)
        {
            droiteOuGauche = "droite";
        }
        else
        {
            droiteOuGauche = "gauche";
        }
        System.out.println("Les "+Voiture.nbroue+"roues  tournent a "+droiteOuGauche+" à un angle de "+angle);
    }

    int acceler(int vitesse)
    {
        System.out.println("J'accélère");
        vitesse= vitesse+vitesse;
        return vitesse;
    }

   int passerVitesse(boolean enVitesse)
    {
        if (enVitesse)
        {
            vitesseCourante++;
        }
        else
        {
           vitesseCourante-- ;
        }
        return vitesseCourante;
    }

    public Ville transporter(Passager passager, Ville villeDeDepart, Ville...villeEtapes)
    {
        System.out.println("la voiture transporte un passager qui se nommerait "+passager.prenom+" " +passager.nom);
        System.out.println("Le passager est parti de la ville de "+villeDeDepart.nom);

        System.out.println("La premiere ville etape est "+villeEtapes[0].nom);
        System.out.println("La deuxieme ville etape est "+villeEtapes[1].nom);
        System.out.println("La troisieme ville etape est "+villeEtapes[2].nom);
        System.out.println("La taille du tableau est "+villeEtapes.length);




        Ville villeDeDestination = new Ville();
        villeDeDestination.nom ="Godomey";
        return villeDeDestination;
    }


    public void vidanger()
    {
        System.out.println("Devisser le bouchon sous la cullasse et qttendre aue ca coule");
    }


    public void klaxonner() {
        System.out.println("La voiture fait Tutu!!!");
    }


   
}
