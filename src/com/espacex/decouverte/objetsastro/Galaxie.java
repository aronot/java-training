package com.espacex.decouverte.objetsastro;

import java.util.Set;

public class Galaxie {
    String nom;
    public Set<Planete> planetes;

    public Galaxie(String nom, Set<Planete> planetes) {
        this.nom = nom;
        this.planetes = planetes;
    }
}
