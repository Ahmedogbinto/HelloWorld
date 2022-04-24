
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Voiture peugeot206 = new Voiture();
        peugeot206.couleur="rouge";

        List list = new ArrayList();
        list.add(peugeot206);
        list.add(3);
        list.add(peugeot206);

        list.remove(peugeot206);
        Object o =  list.get(0);
        System.out.println("Lobjet a lindex 0 est "+o);










    }


}


