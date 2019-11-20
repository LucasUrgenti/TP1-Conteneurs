package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.util.ArrayList;
import java.util.Collection;

public class GestionExpeditions {
    public static void main(String[] args)
    {
        Lecteur lecteur = new Lecteur();
        Collection<Conteneur> conteneurs;
        conteneurs = lecteur.charger("Conteneurs.ser");
        System.out.println(conteneurs);
    }
}
