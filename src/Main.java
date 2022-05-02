
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Voiture peugeot207 = new Voiture();
        peugeot207.couleur= "Rouge";

        Voiture peugeot206 = new Voiture();
        peugeot206.couleur= "Vert";

        Voiture peugeot307 = new Voiture();
        peugeot307.couleur= "Blanche";


        List<Carre> listeCarre = new ArrayList();
        listeCarre.add (new Carre(101));
        listeCarre.add (new Carre(184));
        listeCarre.add (new Carre(46));
        listeCarre.add (new Carre(21));

        Collections.sort(listeCarre);
        for (Carre carre:listeCarre){
            System.out.print(carre.cote);
        }











    }


}


