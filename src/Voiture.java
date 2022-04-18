public class Voiture
{
    int nbPortes=5;
    boolean automatique;
    String couleur;
    int vitesseCourante;

    void klaxonner()
    {
        System.out.println("tutu!!!!!!");
    }
    int acceler()
    {
        System.out.println("J'accélère");
        return 100;
    }
    int passerVitesse(boolean enVitesse)
    {
        if (enVitesse)
        {
            vitesseCourante++;
        }
        else
        {
           vitesseCourante-- ;
        }
        return vitesseCourante;
    }
}
