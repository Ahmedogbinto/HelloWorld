public class Main {

    public static void main(String[] args) {
        Voiture voitureDeAhmed = new Voiture();
        voitureDeAhmed.nbPortes = 3;
        voitureDeAhmed.automatique = true;
        voitureDeAhmed.couleur = "Vert";

        System.out.println("la voiture de Ahmed est " + voitureDeAhmed.couleur + " et elle a " + voitureDeAhmed.nbPortes + " portes");

        voitureDeAhmed.klaxonner();

        voitureDeAhmed.acceler();
        System.out.println(voitureDeAhmed.acceler()+" à l'heure");

        int nouvelleVitesse = voitureDeAhmed.acceler();
        System.out.println("Nouvelle vitesse d'accélération: "+nouvelleVitesse+ " km/h");

        int nouvelleVitesseCourante = voitureDeAhmed.passerVitesse(true);


    }
}
