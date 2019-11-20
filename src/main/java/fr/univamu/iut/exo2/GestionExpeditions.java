package fr.univamu.iut.exo2;

public class GestionExpeditions {
    public static void main(String[] args)
    {
        GestionDistances test = new GestionDistances();
        Integer distance = test.getDistance("Barcelone");
        System.out.println(distance);
    }
}
