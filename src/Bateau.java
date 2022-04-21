public class Bateau implements Amarable
{
    int masse;

    @Override
    public int combienDeCorde(int vitesseDuVent) {
        int nbCordes=masse/10;
        return nbCordes;
    }
}
