/**
 * @author lucas urgenti
 * TP1 Conteneurs
 * 20/11/2019
 */

package fr.univamu.iut.exo3;

import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo2.Comparateur;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.TreeSet;

public class Lecteur {
    public static Collection<Conteneur> charger(String fichier) {

        Collection<Conteneur> conteneurs = new TreeSet<>(new Comparateur());
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