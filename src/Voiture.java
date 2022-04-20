public class Voiture
{
    int nbPortes=5;
    boolean automatique;
    String couleur;
    int vitesseCourante;
    int vitesse;
    Moteur  moteur;
    static int nbroue=4;

    static void klaxonner()
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

    Ville transporter(Passager passager, Ville villeDeDepart)
    {
        System.out.println("Je transporte un passager qui S'appelle "+passager.prenom+" " +passager.nom);
        System.out.println("Le passager est parti de la ville de "+villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom ="Godomey";
        return villeDeDestination;
    }
}
