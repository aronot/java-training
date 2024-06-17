package com.espacex.decouverte.objetsastro;

import com.espacex.decouverte.enginsspatiaux.Vaisseau;

public abstract class Planete implements Comparable {

    public String nom;
    public long diametre;
    int unTour = 360;
    int totalVisiteurs;
    public Atmosphere atmosphere;
    Vaisseau vaisseauAccoste;
    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes;
    public float distanceEtoile;


    public Planete(String nom) {
        this.nom = nom;
        nbPlanetesDecouvertes++;
    }

    public int revolution(int degres) {
        int nombreTour = degres / unTour;
        return nombreTour;
    }

    public int rotation(int degres) {
        int nombreTour = degres / unTour;
        return nombreTour;
    }

    public static String expansion(double distance) {
        if (distance < 14) {
            return "  Oh la la mais c'est super rapide !";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }

    @Override
    public int compareTo(Object o) {
        float distance = ((Planete) o).distanceEtoile;
        return Float.compare(distanceEtoile, distance);

    }
}
