import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Voiture peugeot206 = new Voiture();
        peugeot206.typeBoite = TypeBoiteVitesse.SEMI_AUTO;

        System.out.println("Le type de ma boite est de "+peugeot206.typeBoite.nomTypeBoite);
        System.out.println("Le numero de ma boite de vitess est de "+peugeot206.typeBoite.ordinal());
        TypeBoiteVitesse semiAuto = TypeBoiteVitesse.valueOf("SEMI_AUTO");
        System.out.println(" La boite recuperer par le biais de la chaine de caractere est "+semiAuto.nomTypeBoite);




    }


}

