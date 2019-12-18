package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.TreeSet;

public class Lecteur {
    public static Collection<Conteneur> charger(String file) {
        Collection<Conteneur> lesConteneurs = new TreeSet<Conteneur>(new DistanceComparateur());
        try (FileInputStream fichier = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fichier);) {

            Conteneur c = null;
            try {
                while (true) {
                    c = (Conteneur) ois.readObject();
                    lesConteneurs.add(c);
                }
            } catch (EOFException e) {
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Fin de la restauration");
        return lesConteneurs;

    }
}