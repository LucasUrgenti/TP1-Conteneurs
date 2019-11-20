package fr.univamu.iut.exo2;

import java.util.*;

public class GestionDistances
{
    public SortedMap<String, Integer> villesDistances = new TreeMap<>();

    public GestionDistances()
    {
        villesDistances.put("Barcelone", 183);
        villesDistances.put("Valence", 337);
        villesDistances.put("Alicante", 399);
        villesDistances.put("Malaga", 599);
    }

    public Integer getDistance(String ville)
    {
        return villesDistances.get(ville);
    }
}
