package fr.univamu.iut.exo3;

import fr.univamu.iut.Conteneur;

import java.util.ArrayDeque;
import java.util.Collection;

public class Chargement {
    ArrayDeque<Conteneur> NouveauxConteneurs = new ArrayDeque<>();
    public Chargement(Collection<Conteneur> conteneur)
    {
        NouveauxConteneurs.addAll(conteneur);
    }

    public void embarquer (Conteneur conteneur){
        NouveauxConteneurs.push(conteneur);
    }

    public void debarquer()
    {
        NouveauxConteneurs.pop();
    }

    public ArrayDeque<Conteneur> getConteneur()
    {
        return this.NouveauxConteneurs;
    }
}
