package com.espacex.decouverte;

import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CARGO;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CHASSEUR;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.VAISSEAUMONDE;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.CROISEUR;
import static com.espacex.decouverte.enginsspatiaux.TypeVaisseau.FREGATE;
import com.espacex.decouverte.enginsspatiaux.Vaisseau;
import com.espacex.decouverte.enginsspatiaux.VaisseauCivil;
import com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre;
import com.espacex.decouverte.objetsastro.*;


import java.util.*;

public class HelloUniverse {

    public static void main(String... args) {

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure", 10);
        mercure.diametre = 4880;
        PlaneteTellurique mars = new PlaneteTellurique("Mars", 10);
        mercure.diametre = 4880;
        mercure.distanceEtoile = 57.9f;

        mars.atmosphere = new Atmosphere();
        PlaneteTellurique venus = new PlaneteTellurique("Venus", 10);
        mars.distanceEtoile = 227.9f;
        venus.diametre = 12100;
        venus.distanceEtoile = 108.2f;
        PlaneteTellurique terre = new PlaneteTellurique("Terre", 10);
        terre.diametre = 12756;
        terre.distanceEtoile = 149.6f;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        jupiter.distanceEtoile = 778.3f;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        saturne.distanceEtoile = 14270f;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        uranus.distanceEtoile = 2877.38f;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;
        neptune.distanceEtoile = 449707f;


        Set<Planete> planetes = new TreeSet<>();
        planetes.add(venus);
        planetes.add(neptune);
        planetes.add(mercure);
        planetes.add(saturne);
        planetes.add(uranus);
        planetes.add(jupiter);
        planetes.add(mars);
        planetes.add(terre);
        Galaxie systemSolaire = new Galaxie("Systémes-Solaire", planetes);


                   /* Vaisseau chasseur = new com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre();
                    chasseur.type = "CHASSEUR";
                    chasseur.blindage = 156;
                    chasseur.resistanceDuBouclier = 2;

                    com.espacex.decouverte.enginsspatiaux.Vaisseau vaisseauMonde = new com.espacex.decouverte.enginsspatiaux.VaisseauCivil();
                    vaisseauMonde.type = "VAISSEAU-MONDE";
                    vaisseauMonde.blindage = 4784;
                    vaisseauMonde.resistanceDuBouclier = 30;

                    vaisseauMonde.activerBouclier();
                    chasseur.activerBouclier();
                    ((com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre) chasseur).attaque(vaisseauMonde, "laser photonique", 3);
                    vaisseauMonde.desactiverBouclier();*/

        //   System.out.println("Le com.espacex.decouverte.enginsspatiaux.Vaisseau-Monde dispose encore de " + vaisseauMonde.resistanceDuBouclier + " minutes de protection grâce à son bouclier.");
        //   System.out.println("Le com.espacex.decouverte.enginsspatiaux.Vaisseau-Monde dispose encore d'un blindage de valeur " + vaisseauMonde.blindage + ".");

        Vaisseau fargate = new VaisseauDeGuerre(50);
        fargate.nbPassagers = 100;
        fargate.tonnageActuel = 50;
        System.out.println(fargate.emporterCargaison(45));
        System.out.println(fargate.emporterCargaison(12));

        com.espacex.decouverte.enginsspatiaux.Vaisseau fargate2 = new com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre(50);
        fargate2.nbPassagers = 14;
        fargate2.tonnageActuel = 50;
        System.out.println(fargate2.emporterCargaison(30));

        Vaisseau monde = new VaisseauCivil(2000);
        monde.tonnageActuel = 2000;
        System.out.println(monde.emporterCargaison(1560));
        System.out.println(monde.emporterCargaison(600));

        System.out.println("vaisseau inconnue");

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83f;
        atmosphereUranus.tauxHelium = 15f;
        atmosphereUranus.tauxMethane = 2.5f;
        atmosphereUranus.tauxAzote = 0.0f;

        uranus.atmosphere = atmosphereUranus;

        if (atmosphereUranus.tauxArgon == null) {
            System.out.println("Tux de Argon");
        }
        if (atmosphereUranus.tauxDioxyde == null) {
            System.out.println("Tux de Dioxyde");
        }

        if (atmosphereUranus.tauxSodium == null) {
            System.out.println("Tux de tauxSodium");
        }

        System.out.println(atmosphereUranus.tauxHydrogene + "," + atmosphereUranus.tauxMethane + "," + atmosphereUranus.tauxAzote
                + "," + atmosphereUranus.tauxHelium);

       /* mars.atmosphere.constituants.put("CO2", 95f);
        mars.atmosphere.constituants.put("N2", 3f);
        mars.atmosphere.constituants.put("AR", 1.5F);
        mars.atmosphere.constituants.put("no", 0.013F);

        for (Map.Entry<String, Float> key : mars.atmosphere.constituants.entrySet()) {
            System.out.println("L'atmosphère de Mars est constituée de :" + key.getValue() + "de" + key.getKey());
        }*/

        Vaisseau vaisseauMonde = new VaisseauCivil(VAISSEAUMONDE);
        Vaisseau chasseur = new VaisseauDeGuerre(CHASSEUR);
        Vaisseau cargo = new VaisseauDeGuerre(CARGO);
        Vaisseau croiseur = new VaisseauDeGuerre(CROISEUR);
        Vaisseau fregate = new VaisseauDeGuerre(CHASSEUR);
        Vaisseau chasseur1 = new VaisseauDeGuerre(CHASSEUR);
        Vaisseau chasseur2 = new VaisseauDeGuerre(CHASSEUR);
        Vaisseau cargo1 = new VaisseauCivil(CARGO);

        // com.espacex.decouverte.objetsastro.PlaneteTellurique terre1 = new com.espacex.decouverte.objetsastro.PlaneteTellurique("TERRE", 10);
        // terre1.restePlaceDisponible();
        //terre1.accueillirVaisseaux(chasseur1, chasseur2, cargo1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel vaisseau souhaiter vous manipluer ?" + chasseur.type + ","
                + cargo.type + "," + vaisseauMonde.type + "," + croiseur.type + "," + fregate.type);
        com.espacex.decouverte.enginsspatiaux.Vaisseau vaisseau = null;
        String vaisseauChoisie = sc.nextLine();

        System.out.println("Quelle tonnage de cargaison il souhaite embarquer ?");
        int tonnage = sc.nextInt();
        switch (vaisseauChoisie) {
            case "CHAUSSEUR":
                vaisseau = new VaisseauDeGuerre(CHASSEUR);
                chasseur.tonnageActuel = tonnage;
                System.out.println(chasseur.emporterCargaison(tonnage));
                break;
            case "CARGO":
                vaisseau = new VaisseauDeGuerre(CARGO);
                cargo.tonnageActuel = tonnage;
                System.out.println(cargo.emporterCargaison(tonnage));
                break;
            case "VAISSEAUMONDE":
                vaisseau = new VaisseauCivil(VAISSEAUMONDE);
                vaisseauMonde.tonnageActuel = tonnage;
                System.out.println(vaisseauMonde.emporterCargaison(tonnage));
                break;
            case "CROISEUR":
                vaisseau = new VaisseauDeGuerre(CROISEUR);
                croiseur.tonnageActuel = tonnage;
                System.out.println(croiseur.emporterCargaison(tonnage));
                break;
            case "FREGATE":
                vaisseau = new VaisseauDeGuerre(FREGATE);
                fregate.tonnageActuel = tonnage;
                System.out.println(fregate.emporterCargaison(tonnage));
                break;

        }
        System.out.println("Quelle est la taille de baie pour la planéte");
        int tailleBaieAccostage = sc.nextInt();
        sc.nextLine();


        System.out.println("Sur quelle planète tellurique il souhaite se poser, Mars, Terre, Neptune ou toto");
        String planeteChoisie = sc.nextLine();
        PlaneteTellurique planete = null;

        for (Planete p : systemSolaire.planetes) {
            if (Objects.equals(p.nom, planeteChoisie)) {
                planete = new com.espacex.decouverte.objetsastro.PlaneteTellurique(p.nom, tailleBaieAccostage);
                break;
            }
        }

                String response = sc.nextLine();
        do {
            assert planete != null;
            if (planete.restePlaceDisponible(vaisseau)) {
                planete.accueillirVaisseaux(vaisseau);
                System.out.println("Bravo un viasseau vient de se poser");
            } else {
                System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.\".");
                break;
            }
            System.out.println("Voulez-vous recommencer oui/non ?");
            response = sc.nextLine();
        }
        while (response.contains("oui"));



        for (Planete key : systemSolaire.planetes) {
            System.out.println(key.nom);
        }


    }
}
