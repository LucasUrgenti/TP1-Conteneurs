package fr.univamu.iut.exo3;

import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo2.Lecteur;

import java.util.ArrayDeque;
import java.util.Collection;

public class GestionExpeditions {
    public static void main(String[] args)
    {
        Collection<Conteneur> MesConteneurs = Lecteur.charger("Conteneurs.ser");

        Chargement monChargement = new Chargement(MesConteneurs);

        monChargement.debarquer();

        monChargement.embarquer(new Conteneur("le J", 135, "St Jean du désert"));

        for (Conteneur monConteneur : MesConteneurs)
        {
            System.out.println(monConteneur.toString());
        }

        System.out.println("\n");

        for (Conteneur monConteneur : monChargement.getConteneur())
        {
            System.out.println(monConteneur.toString());
        }
    }
}
