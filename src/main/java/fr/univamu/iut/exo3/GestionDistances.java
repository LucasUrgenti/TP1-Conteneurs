package fr.univamu.iut.exo3;

import java.util.Map;
import java.util.TreeMap;

public class GestionDistances
{
    public Map<String, Integer> distance = new TreeMap<>();
    public GestionDistances()
    {
        distance.put("Barcelone", 183);
        distance.put("Valence", 337);
        distance.put("Alicante", 399);
        distance.put("Malaga", 599);
        distance.put("St Jean du désert", 13005);
    }

    public Integer getDistance(String ville)
    {
        return distance.get(ville);
    }
}
