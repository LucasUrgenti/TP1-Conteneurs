package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

import java.util.Iterator;
import java.util.TreeSet;

public class GestionExpeditions {
    public static void main(String[] args) {
        TreeSet<Conteneur> ts = (TreeSet<Conteneur>) Lecteur
                .charger("Conteneurs.ser");

        System.out.println("Calcul des prix");
        Iterator<Conteneur> it = ts.iterator();
        Conteneur c;
        while (it.hasNext()) {
            c = it.next();
            System.out.println(c);
            Tarif ct = GestionClient.getMap().get(c.getExpediteur());
            System.out.println(c.getTarif(ct) + "\n");
        }
    }
}