package fr.ecole3il.rodez2023.perlin.terrain.generation;

import java.util.Random;

import fr.ecole3il.rodez2023.perlin.terrain.elements.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;


public class GenerateurAleatoire extends GenerateurCarte {

    Random random;

    public GenerateurAleatoire(long graine) {
        super(graine);
        this.random = new Random();
    }

    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        double altitude = this.random.nextDouble();
        double hydrometrie = this.random.nextDouble();
        double temperature = this.random.nextDouble();

        try {
            return new Terrain(altitude, hydrometrie, temperature);
        } catch (MauvaiseValeurException e) {
            e.printStackTrace();
            return null;
        }
    }
}