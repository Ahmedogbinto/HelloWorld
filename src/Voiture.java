public class Voiture
{
    int nbPortes=5;
    boolean automatique;
    String couleur;
    int vitesseCourante;
    int vitesse;
    Moteur  moteur;

    void klaxonner()
    {
        System.out.println("tutu!!!!!!");
    }
    int acceler()
    {
        System.out.println("J'accélère");
        return 100;
    }
    int acceler(int vitesse)
    {
        System.out.println("J'accélère");
        this.vitesse= this.vitesse+vitesse;
        return this.vitesse;
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

    void tourner(boolean droite, int angle)
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
        System.out.println("Je tourne "+droiteOuGauche+" à un angle de "+angle);
    }
}
