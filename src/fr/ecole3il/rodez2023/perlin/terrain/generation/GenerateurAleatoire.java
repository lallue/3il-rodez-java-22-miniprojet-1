package fr.ecole3il.rodez2023.perlin.terrain.generation;

import java.util.Random;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public abstract class GenerateurAleatoire extends GenerateurCarte {

    public GenerateurAleatoire(long graine) {
        super(graine);
    }

    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        Random random = new Random(getGraine());
        double altitude = random.nextDouble();
        double hydrometrie = random.nextDouble();
        double temperature = random.nextDouble();
        return new Terrain(altitude, hydrometrie, temperature);
    }
}
