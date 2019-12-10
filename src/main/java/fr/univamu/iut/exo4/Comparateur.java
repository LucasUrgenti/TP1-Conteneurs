package fr.univamu.iut.exo4;

import fr.univamu.iut.Conteneur;

import java.util.Comparator;

public class Comparateur implements Comparator<Conteneur>
{
    public int compare(Conteneur i1, Conteneur i2)
    {
        if (i1.getpoids() < i2.getpoids())
        {
            return -1;
        }
        if (i1.getpoids() > i2.getpoids())
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}
