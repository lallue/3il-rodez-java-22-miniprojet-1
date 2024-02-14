package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public abstract class GenerateurPerlin extends GenerateurCarte {

    public GenerateurPerlin(long graine) {
        super(graine);
    }

    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        double x = (double) i / largeur;
        double y = (double) j / hauteur;

        // Utilisation de la classe BruitPerlin2D pour générer le bruit de Perlin
        BruitPerlin2D perlin2D = new BruitPerlin2D(getGraine(), 1.0);  // 1.0 est la résolution, vous pouvez ajuster cela
        double bruit = perlin2D.bruit2D(x, y);

        double altitude = bruit;
        double hydrometrie = bruit * 2;  // La graine de l'hydrométrie est le double de la graine principale
        double temperature = bruit * 4;  // La graine de la température est le double de l'hydrométrie

        return new Terrain(altitude, hydrometrie, temperature);
    }
}
