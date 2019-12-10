package fr.univamu.iut.exo2;

import fr.univamu.iut.Conteneur;

import java.util.Collection;

public class GestionExpeditions {
    public static void main(String[] args)
    {
        Collection<Conteneur> MesConteneurs = Lecteur.charger("Conteneurs.ser");
        for (Conteneur monConteneur : MesConteneurs)
        {
            System.out.println(monConteneur.toString());
        }
    }
}
