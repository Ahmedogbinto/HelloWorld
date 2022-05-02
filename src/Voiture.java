public class Voiture extends Vehicule implements Vidangeable
{
    static int nbroue=4;
    int nbPortes=5;
    TypeBoiteVitesse typeBoite;
    boolean automatique;
    Integer vitesseCourante;
    String couleur;

    Voiture()
    {
    }
    Voiture(String couleur)
    {
        this.couleur=couleur;
        System.out.println("Une voiture est en construction avec couleur");
    }

    Voiture(String carburation, int nbCylindre)
    {
        Moteur moteur = new Moteur();
        moteur.carburation = carburation;
        moteur.nbCylindre = nbCylindre;
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

    Ville transporter(Passager passager, Ville villeDeDepart, Ville...villeEtapes)
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
        System.out.println("Devosser le bouchon sous la cullasse et qttendre aue ca coule");
    }


    void klaxonner() {
        System.out.println("La voiture fait Tutu!!!");
    }


   
}
