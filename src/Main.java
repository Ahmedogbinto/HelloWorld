public class Main {

    public static void main(String[] args) {
        Voiture voitureDeAhmed = new Voiture();
        voitureDeAhmed.nbPortes = 3;
        voitureDeAhmed.automatique = true;
        voitureDeAhmed.couleur = "Vert";



        Voiture voitureDeJerome = new Voiture();
        voitureDeJerome.nbPortes = 5;
        voitureDeJerome.automatique = true;
        Moteur moteur = new Moteur();
        moteur.carburation = "diesel";
        moteur.cylindre = 6;
        voitureDeJerome.moteur = moteur;

        voitureDeAhmed.moteur = moteur;
        voitureDeJerome.moteur.cylindre = 8;

        System.out.println("Le nombre de cylindre de la voiture de Jerome est "+voitureDeJerome.moteur.cylindre);
        System.out.println("Le nombre de cylindre de la voiture de Ahmed est "+voitureDeJerome.moteur.cylindre);

        Passager passager = new Passager();
        passager.nom = "Dupond";
        passager.prenom = "Vincent";

        Ville ville = new Ville();
        ville.nom ="Calavi";
       Ville destination = voitureDeAhmed.transporter(passager, ville);
       System.out.println("Le passager est arrivé dans la ville de "+destination.nom);

       System.out.println("Le nombre de roue de la voiture de Ahmed est "+voitureDeAhmed.nbroue);
        System.out.println("Le nombre de roue de la voiture de Jerome est "+voitureDeJerome.nbroue);

         Voiture.nbroue=5;
        System.out.println("Le nombre de roue de la voiture de Ahmed est "+voitureDeAhmed.nbroue);
        System.out.println("Le nombre de roue de la voiture de Jerome est "+voitureDeJerome.nbroue);
        System.out.println("Le nombre de roue d'une voiture est de "+Voiture.nbroue);

        Voiture.klaxonner();
        Voiture.tourner(true, 50);










    }
}
