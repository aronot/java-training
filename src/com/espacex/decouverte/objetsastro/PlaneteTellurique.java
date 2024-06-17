package com.espacex.decouverte.objetsastro;

import com.espacex.decouverte.enginsspatiaux.Vaisseau;
import com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre;

public class PlaneteTellurique extends Planete implements Habitable {


    Vaisseau[][] vaisseauxAccostes;

    public PlaneteTellurique(String nom, int tailleBaieAccostage) {
        super(nom);
        this.vaisseauxAccostes = new Vaisseau[2][tailleBaieAccostage];
    }

    public boolean restePlaceDisponible(Vaisseau vaisseau) {
        int nbPlaceLibreGuerre = 0;
        int placeLibreCivil = 0;
        boolean resulta = false;
        int type;
        if (vaisseau instanceof VaisseauDeGuerre) {
            type = 0;
        } else {
            type = 1;
        }
        for (int i = 0; i < vaisseauxAccostes[type].length; i++) {

            if (vaisseauxAccostes[type][i] == null) {
                nbPlaceLibreGuerre++;
            }
            resulta = nbPlaceLibreGuerre > 0;
        }

        return resulta;
    }

    @Override
    public int accueillirVaisseaux(Vaisseau... plusieurVaisseau) {
        int type;
        for (Vaisseau vaisseau : plusieurVaisseau) {
            if (vaisseau instanceof VaisseauDeGuerre) {
                type = 0;
            } else {
                type = 1;
            }
            for (int libre = 0; libre <= vaisseauxAccostes[type].length; libre++) {
                if (vaisseauxAccostes[type][libre] == null) {
                    if (vaisseau instanceof VaisseauDeGuerre) {
                        ((VaisseauDeGuerre) vaisseau).desactiverArmes();
                    }
                    vaisseauxAccostes[type][libre] = vaisseau;
                    break;
                    //   nbPassagersTotal = listVaisseau[i].nbPassagers + nbPassagersTotal;
                }
            }
        }
        return 1;
    }
}
