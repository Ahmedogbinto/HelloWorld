public class Voiture
{
    static int nbroue=4;
    int nbPortes=5;
    boolean automatique;
    int vitesseCourante;
    int vitesse;
    String couleur;
    Moteur  moteur;
    Voiture()
    {
        System.out.println("Une voiture est en construction sans parametre");
    }
    Voiture(String couleur)
    {
        this.couleur=couleur;
        System.out.println("Une voiture est en construction avec couleur");
    }

    Voiture(Moteur moteur)
    {
        this.moteur=moteur;
        System.out.println("Une voiture est en construction avec le moteur");
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
    Ville transporter(Passager passager, Ville villeDeDepart)
    {
        System.out.println("Je transporte un passager qui S'appelle "+passager.prenom+" " +passager.nom);
        System.out.println("Le passager est parti de la ville de "+villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom ="Godomey";
        return villeDeDestination;
    }
}
