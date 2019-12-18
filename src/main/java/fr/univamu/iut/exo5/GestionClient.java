package fr.univamu.iut.exo5;

import java.util.Map;
import java.util.TreeMap;

public class GestionClient {
    private static TreeMap<String, Tarif> lesClients;

    static {
        lesClients = new TreeMap<String, Tarif>();
        lesClients.put("Soc1", new TarifMiles(2.0));
        lesClients.put("Soc2", new TarifPoids(2.0));
        lesClients.put("Soc3", new TarifRemise(0.2));
        lesClients.put("Soc4", new TarifMiles(2.0));
    }

    public static Map<String, Tarif> getMap() {
        return lesClients;
    }
}