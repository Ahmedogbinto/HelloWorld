package com.udemy.decouvertejava.demonstration;

public class Carre implements Comparable {

    long cote;

    Carre(long cote) {
        this.cote = cote;
    }


    @Override
    public int compareTo(Object o) {
        Carre autreCarre = (Carre) o;
        if (cote == autreCarre.cote) return 0;
        if (cote > autreCarre.cote) return 1;
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Carre))
        {
            return false;
        }
        Carre autreCarre = (Carre) obj;
        return cote ==  autreCarre.cote;
    }

    @Override
    public int hashCode() {
        return cote.hachCode();
    }
}
