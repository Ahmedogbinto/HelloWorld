import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] tableauEntier = new int[3][5];
        tableauEntier [0][1]=12;
        for (int col=0; col<tableauEntier.length;col++){
            for(int ligne=0;ligne<tableauEntier[col].length;ligne++)
                System.out.println("Lelement contenu a la position "+col+" "+ligne+ " est "+tableauEntier[col][ligne]);
        }








    }


}

