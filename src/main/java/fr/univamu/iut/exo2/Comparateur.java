package fr.univamu.iut.exo2;

import fr.univamu.iut.Conteneur;

import java.util.Comparator;

public class Comparateur implements Comparator<Conteneur>
{
    public int compare(Conteneur i1, Conteneur i2)
    {
        if (i1.getDistance() < i2.getDistance())
        {
            return -1;
        }
        if (i1.getDistance() > i2.getDistance())
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
