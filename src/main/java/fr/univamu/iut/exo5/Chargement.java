package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

public class Chargement {

    ArrayDeque<Conteneur> leChargement;

    public Chargement(Collection<Conteneur> ts) {
        leChargement = new ArrayDeque<Conteneur>();
        Iterator<Conteneur> it = ts.iterator();
        while (it.hasNext()) {
            Conteneur c = it.next();
            leChargement.add(c);
        }
    }

    public Conteneur decharger() {
        return leChargement.pop();
    }

    public void embarquer(Conteneur c) {
        leChargement.push(c);
    }

    public String toString() {
        String result = new String();
        Iterator<Conteneur> it = leChargement.iterator();
        while (it.hasNext())
            result += it.next() + "\n";
        return result;
    }

}
