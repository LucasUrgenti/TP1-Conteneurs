package fr.univamu.iut;

import fr.univamu.iut.exo2.GestionDistances;
import fr.univamu.iut.exo5.Tarif;
import fr.univamu.iut.exo5.TarifMiles;

import java.io.Serializable;

public class Conteneur implements Serializable {

    private static final long serialVersionUID = 1L;

    private String expediteur;
    private int poids;
    private String destination;
    private Tarif t;

    public Conteneur(String expediteur, int poids, String destination) {
        this.expediteur = expediteur;
        this.poids = poids;
        this.destination = destination;
        this.t = new TarifMiles();
    }

    public Integer getDistance()
    {
        GestionDistances test = new GestionDistances();
        return test.getDistance(destination);
    }

    public String getDestination()
    {
        return this.destination;
    }

    public int getpoids()
    {
        return this.poids;
    }

    public double getTarif( Tarif t){
        return t.calculerTarif();
    }

    @Override
    public String toString() {
        return "Conteneur expédié par la société " +
                expediteur +
                ", de poids " + poids +
                " et à destination de " + destination;
    }
}
