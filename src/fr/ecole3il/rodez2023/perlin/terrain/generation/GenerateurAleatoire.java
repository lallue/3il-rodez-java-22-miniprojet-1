package fr.ecole3il.rodez2023.perlin.terrain.generation;

import java.util.Random;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;


public class GenerateurAleatoire extends GenerateurCarte {

    public GenerateurAleatoire(long graine) {
        super(graine);
    }

    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        Random pifometre = new Random();
        double altitude = pifometre.nextDouble(0, 1);
        double hydrometrie = pifometre.nextDouble(-1, 1);
        double temperature = pifometre.nextDouble(0, 1);
        return new Terrain(altitude, hydrometrie, temperature);
    }
}
