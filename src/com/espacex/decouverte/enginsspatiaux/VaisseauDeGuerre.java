package com.espacex.decouverte.enginsspatiaux;

import java.util.Objects;

public class VaisseauDeGuerre extends Vaisseau {

    private boolean armesDesactivees;

    public VaisseauDeGuerre(int tonnageMax) {
        super(tonnageMax);
    }

    public VaisseauDeGuerre(TypeVaisseau type) {
        super(type);
    }

    public void attaque(Vaisseau vaisseauCible, String arme, int dureeAttaque) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivée");
        } else {
            System.out.println("Un vaisseau de type " + type + "attaque un vaisseau de type " + vaisseauCible.type + " en utilisant l 'arme " + arme + " pendant " + dureeAttaque + "minutes.");

            System.out.println("De détruire complètement le bouclier");
            vaisseauCible.resistanceDuBouclier = 0;
            System.out.println("De diminuer le blindage de moitié");
            vaisseauCible.blindage = vaisseauCible.blindage / 2;
        }
    }

    public void desactiverArmes() {
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
        //return armesDesactivees;
    }

    public void activerArmes() {
        armesDesactivees = false;
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
        //return armesDesactivees;
    }

    @Override
    public void activerBouclier() {
        desactiverArmes();
        System.out.println("je suis dans le com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre");
        super.activerBouclier();
    }

    public int emporterCargaison(int tonnage) {
        if (Objects.equals(type, "CHASSEUR")) {
            System.out.println("Le chasseur n'emporte pas de cargaison, l'ensemble sera rejeté");

        } else if (nbPassagers >= 12) {
            if (nbPassagers * 2 >= tonnage) {
                if (tonnageActuel >= tonnage) {
                    tonnageActuel = tonnageActuel - tonnage;
                    return 0;
                } else {
                    tonnageActuel = tonnage - tonnageActuel;
                }
            } else {
                tonnageActuel = tonnage - nbPassagers * 2;
            }
        } else {
            System.out.println("toute la marchanise est rejeté");
            tonnageActuel = tonnage;
        }
        return tonnageActuel;
    }
}