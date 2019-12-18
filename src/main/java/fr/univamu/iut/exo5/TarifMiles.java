package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

public class TarifMiles implements Tarif {
    double prixAuMile;

    public TarifMiles(double prixAuMile) {
        this.prixAuMile = prixAuMile;
    }

    public String identifie() {
        return "Tarif calculé au prix du km de " + prixAuMile + " \n";
    }

    public double calculerTarif(Conteneur c) {
        return GestionDistances.getDistances(c.getDestination()) * prixAuMile;
    }
}