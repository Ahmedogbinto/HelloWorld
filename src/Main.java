
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Voiture peugeot206 = new Voiture();
        Voiture peugeot207 = new Voiture();

        peugeot206.couleur="rouge";

        Set<Voiture> set = new HashSet();
        set.add(peugeot206);
        set.add(peugeot207);
        set.add(peugeot206);

        for (Voiture voiture: set) {
            System.out.println(voiture.couleur);
        }

        Iterator<Voiture> it=set.iterator();
        while (it.hasNext()){
            Voiture v = it.next();
            System.out.println(v.couleur);
        }












    }


}


