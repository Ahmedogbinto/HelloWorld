
package com.udemy.decouvertejava.demonstration.transport.terrestre;

import com.udemy.decouvertejava.demonstration.transport.Moteur;
import com.udemy.decouvertejava.demonstration.transport.Passager;
import com.udemy.decouvertejava.demonstration.transport.TypeBoiteVitesse;
import com.udemy.decouvertejava.demonstration.transport.Vehicule;

import java.util.Objects;

public class Voiture extends Vehicule implements com.udemy.decouvertejava.demonstration.Vidangeable
{
    static int nbroue=4;
    /**
     *
     */
    static int nbPortes=5;
    private TypeBoiteVitesse typeBoite;
    boolean automatique;
    private Integer vitesseCourante;
    private String couleur;
    private String immatriculation;



    public static int getNbPortes() {
        return nbPortes;
    }

    public static void setNbPortes(int nbPortes) {
        Voiture.nbPortes = nbPortes;
    }

    public com.udemy.decouvertejava.demonstration.transport.TypeBoiteVitesse getTypeBoite() {
        return typeBoite;
    }

    public void setTypeBoite(com.udemy.decouvertejava.demonstration.transport.TypeBoiteVitesse typeBoite) {
        this.typeBoite = typeBoite;
    }

    public boolean isAutomatique() {
        return automatique;
    }

    public void setAutomatique(boolean automatique) {
        this.automatique = automatique;
    }

    public Integer getVitesseCourante() {
        return vitesseCourante;
    }

    public void setVitesseCourante(Integer vitesseCourante) {
        this.vitesseCourante = vitesseCourante;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getImmatriculation() {
        return immatriculation;
    }
    public void immatriculation(String numeroImmmatriculation) throws NombreDeCaractereInvalidExecption/*,VoitureDejaImmatriculeeException*/{
        if (numeroImmmatriculation.length() !=9) {
            throw new NombreDeCaractereInvalidExecption("Le numero immatriculation" +numeroImmmatriculation+" ne comporte pas le nombre de caractere attenduy");
        }
       /*if(this.immatriculation != null){

        }*/
        this.immatriculation = numeroImmmatriculation;
    }
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
        /**
         *
         */
        this();
        this.couleur=couleur;
        System.out.println("Une voiture est en construction avec couleur");
    }

    Voiture(String carburation, int nbCylindre)
    {
        /**
         *
         */
        Moteur moteur = new Moteur();
        moteur.carburation = carburation;
        moteur.nbCylindre = nbCylindre;
        this.moteur = moteur;
    }

    static void tourner(boolean droite, int angle)
    {
        /**
         *
         */
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

    public com.udemy.decouvertejava.demonstration.Ville transporter(Passager passager, com.udemy.decouvertejava.demonstration.Ville villeDeDepart, com.udemy.decouvertejava.demonstration.Ville...villeEtapes)
    {
        System.out.println("la voiture transporte un passager qui se nommerait "+passager.prenom+" " +passager.nom);
        System.out.println("Le passager est parti de la ville de "+villeDeDepart.nom);

        System.out.println("La premiere ville etape est "+villeEtapes[0].nom);
        System.out.println("La deuxieme ville etape est "+villeEtapes[1].nom);
        System.out.println("La troisieme ville etape est "+villeEtapes[2].nom);
        System.out.println("La taille du tableau est "+villeEtapes.length);




        com.udemy.decouvertejava.demonstration.Ville villeDeDestination = new com.udemy.decouvertejava.demonstration.Ville();
        villeDeDestination.nom ="Godomey";
        return villeDeDestination;
    }


    public void vidanger()
    {
        /**
         *
         */
        System.out.println("Devisser le bouchon sous la cullasse et qttendre aue ca coule");
    }


    public void klaxonner() {
        System.out.println("La voiture fait Tutu!!!");
    }


   
}
