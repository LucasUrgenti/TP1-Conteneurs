package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

public class TarifRemise implements Tarif {

    double TauxRemise;

    public double calculerTarif(Conteneur c) {
        return new TarifPoids(1.0).calculerTarif(c) * TauxRemise;
    }

    public String identifie() {
        return "Tarif calculé en tenant compte d'un taux de remise pour fidélité de "
                + TauxRemise * 100 + "%";
    }

    public TarifRemise(double tauxFidelite) {
        TauxRemise = tauxFidelite;
    }
}