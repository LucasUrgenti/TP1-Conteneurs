/**
 * @author lucas urgenti
 * TP1 Conteneurs
 * 20/11/2019
 */

package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.io.*;

import java.util.ArrayList;
import java.util.Collection;

public class Lecteur {
    public static Collection<Conteneur> charger(String fichier) {
        Collection<Conteneur> conteneurs = new ArrayList<>();
        try
        {
            FileInputStream file = new FileInputStream(fichier);
            ObjectInputStream ois = new ObjectInputStream(file);
            Conteneur c;
            try{
                while(true)
                {
                    Object o = ois.readObject();
                    if(o.getClass().equals(Conteneur.class)) {
                        c = (Conteneur) o;
                        conteneurs.add(c);
                    }
                    else{}
                }
            }
            catch(EOFException e) {}
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        return conteneurs;
    }
}