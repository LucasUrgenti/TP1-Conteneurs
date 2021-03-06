package fr.univamu.iut.exo2;

import java.util.*;

public class GestionDistances
{
    public Map<String, Integer> distance = new TreeMap<>();
    public GestionDistances()
    {
        distance.put("Barcelone", 183);
        distance.put("Valence", 337);
        distance.put("Alicante", 399);
        distance.put("Malaga", 599);
    }

    public Integer getDistance(String ville)
    {
        return distance.get(ville);
    }
}
