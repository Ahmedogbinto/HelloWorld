public class VehiculeAMoteur
{
    Moteur  moteur;
    int vitesse;

    VehiculeAMoteur()
    {
        System.out.println("Un vehicule a moteur est construit");
    }
    VehiculeAMoteur(Moteur moteur)
    {
        this.moteur=moteur;
        System.out.println("Une voiture est en construction avec le moteur");
    }

    int acceler()
    {
        System.out.println("J'accélère");
        return 100;
    }
    Ville transporter(Passager passager, Ville villeDeDepart)
    {
        System.out.println("Le vehicule transporte un passager qui S'appelle "+passager.prenom+" " +passager.nom);
        System.out.println("Le passager est parti de la ville de "+villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom ="Godomey";
        return villeDeDestination;
    }
}
