package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

import java.util.Comparator;

public class PoidsComparateur implements Comparator<Conteneur> {

    public int compare(Conteneur c1, Conteneur c2) {
        return c1.getpoids() - c2.getpoids();
    }
}