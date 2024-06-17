package com.espacex.decouverte.enginsspatiaux;

public class VaisseauCivil extends Vaisseau {

    public VaisseauCivil(int tonnageMax) {
        super(tonnageMax);
    }
    public VaisseauCivil(TypeVaisseau type) {
        super(type);
    }

    public int emporterCargaison(int tonnage) {

        if (tonnageActuel >= tonnage) {
            tonnageActuel = tonnageActuel - tonnage;
            return 0;
        } else {
            tonnageActuel = tonnage-tonnageActuel ;
        }
        return tonnageActuel;
    }
}
