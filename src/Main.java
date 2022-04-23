import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Voiture peugeot206 = new Voiture();
        peugeot206.typeBoite = TypeBoiteVitesse.SEMI_AUTO;

       int[] tableauDeInt = new int[5];
       char[] tableauDeChar = new char[5];
       Voiture[] tableauDeVoiture = new Voiture[5];

       tableauDeInt[1]=15;
       tableauDeInt[4]=16;
       System.out.println("Le deuxieme element du tableau des entiers est"+tableauDeInt[1]);
       System.out.println("La longueur du tableau est"+tableauDeInt.length);






    }


}

