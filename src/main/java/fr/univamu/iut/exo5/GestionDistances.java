package fr.univamu.iut.exo5;

import java.util.Map;
import java.util.TreeMap;

public class GestionDistances {

    private static Map<String, Integer> distVilles;

    static {
        distVilles = new TreeMap<String, Integer>();
        distVilles.put("Alicante", 399);
        distVilles.put("Valence", 347);
        distVilles.put("Malaga", 599);
        distVilles.put("Barcelone", 183);
    }

    public static int getDistances(String d) {
        return distVilles.get(d);

    }
}