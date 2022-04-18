public class Main
{

    public static void main(String[] args)
    {
        Voiture voitureDeAhmed = new Voiture();
        voitureDeAhmed.nbPortes=3;
        voitureDeAhmed.automatique=true;
        voitureDeAhmed.couleur="Vert";

        System.out.println("la voiture de Ahmed est "+voitureDeAhmed.couleur+" et elle a "+voitureDeAhmed.nbPortes+" portes");
    }
}