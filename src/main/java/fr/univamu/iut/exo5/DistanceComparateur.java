package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

import java.util.Comparator;

public class DistanceComparateur implements Comparator<Conteneur> {

    public int compare(Conteneur o1, Conteneur o2) {
        return o1.getDistance() - o2.getDistance();
    }

}
