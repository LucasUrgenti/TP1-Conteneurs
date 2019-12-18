package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

public class TarifPoids implements Tarif {

    double prixAuKilo;

    public TarifPoids(double prixAuPoids) {
        this.prixAuKilo = prixAuPoids;
    }

    public String identifie() {
        return "Tarif calculé au prix du poids de " + prixAuKilo + " \n";
    }

    public double calculerTarif(Conteneur c) {
        return c.getpoids() * prixAuKilo;
    }
}