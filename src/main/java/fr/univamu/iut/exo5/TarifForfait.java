package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

//Question 3
public class TarifForfait implements Tarif {

    double montantForfait;

    public TarifForfait(double montantForfait) {
        this.montantForfait = montantForfait;
    }

    public String identifie() {
        return "Tarif forfaitaire d'un montant de " + montantForfait + " \n";
    }

    public double calculerTarif(Conteneur c) {
        return montantForfait;
    }

}
