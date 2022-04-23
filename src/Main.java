import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Voiture peugeot206 = new Voiture();


        Passager passager = new Passager();
        passager .nom ="Dupond";
        passager.prenom="Michel";

        Ville depart = new Ville();
        depart.nom="Aukland";

        Ville etape1 = new Ville();
        etape1.nom = "Taupo";

        Ville etape2 = new Ville();
        etape2.nom = "wellington";

        Ville etape3 = new Ville();
        etape3.nom = "hallmington";

        peugeot206.transporter(passager, depart, etape1, etape2, etape3);






    }


}

