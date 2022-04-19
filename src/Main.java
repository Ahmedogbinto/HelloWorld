public class Main {

    public static void main(String[] args) {
        Voiture voitureDeAhmed = new Voiture();
        voitureDeAhmed.nbPortes = 3;
        voitureDeAhmed.automatique = true;
        voitureDeAhmed.couleur = "Vert";

        Voiture voitureDeJerome = new Voiture();

        boolean egalOuNon = voitureDeAhmed == voitureDeJerome;
        System.out.println(egalOuNon);

        int nouvelleVitesse = voitureDeAhmed.acceler(50);
        System.out.println("La nouvelle vitesse est de "+nouvelleVitesse);


    }
}
