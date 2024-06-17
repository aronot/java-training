package com.espacex.decouverte.enginsspatiaux;



public abstract class Vaisseau {

    public TypeVaisseau type;
    public int nbPassagers;
    public int blindage; // capacité de resister à une attaque
    int resistanceDuBouclier; // capaciét de resistance aux attaques en minutes
    int tonnageMax;
    protected int tonnageActuel;

    public Vaisseau(int tonnageMax) {
        this.tonnageMax = tonnageMax;
    }

    public Vaisseau(TypeVaisseau type) {
        this.type = type;
    }

    public void activerBouclier() {
        System.out.println("Activation du bouclier d'un vaisseau de type  " + type);
    }

    public void desactiverBouclier() {
        System.out.println("Désactivation du bouclier d'un vaisseau de type " + type);

    }

    public abstract int emporterCargaison(int tonnage);
}
