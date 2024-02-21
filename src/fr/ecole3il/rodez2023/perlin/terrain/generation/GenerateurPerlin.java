package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

/**
 * La classe GenerateurPerlin étend la classe abstraite GenerateurCarte
 * et implémente la génération de carte en utilisant le bruit de Perlin 2D.
 */
public class GenerateurPerlin extends GenerateurCarte {

    /**
     * Constructeur de la classe GenerateurPerlin.
     *
     * @param graine La graine pour initialiser le générateur de bruit de Perlin 2D.
     */
    public GenerateurPerlin(long graine) {
        super(graine);
    }

    /**
     * Génère un terrain en utilisant le bruit de Perlin 2D en fonction des coordonnées spécifiées,
     * de la largeur et de la hauteur.
     *
     * @param i        Coordonnée x de la position dans la carte.
     * @param j        Coordonnée y de la position dans la carte.
     * @param largeur  Largeur de la carte.
     * @param hauteur  Hauteur de la carte.
     * @return Un objet Terrain généré à l'aide du bruit de Perlin 2D.
     */
    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        // Initialisation des générateurs de bruit de Perlin 2D pour altitude, hydrométrie et température
        BruitPerlin2D altitudePerlin = new BruitPerlin2D(getGraine(), 1);
        BruitPerlin2D hydrometriePerlin = new BruitPerlin2D(getGraine(), 1);
        BruitPerlin2D temperaturePerlin = new BruitPerlin2D(getGraine() * 2, 1);

        // Conversion des coordonnées normalisées (entre 0 et 1) en fonction de la largeur et la hauteur
        double x = (double) i / (double) largeur;
        double y = (double) j / (double) hauteur;

        // Génération des valeurs de bruit de Perlin pour altitude, hydrométrie et température
        double altitude = altitudePerlin.bruit2D(x, y);
        double hydrometrie = hydrometriePerlin.bruit2D(x, y);
        double temperature = temperaturePerlin.bruit2D(x, y);

        // Normalisation des valeurs hydrométrie et température entre 0 et 1
        hydrometrie = (hydrometrie + 1) / 2;
        temperature = (temperature + 1) / 2;

        // Création d'un nouvel objet Terrain avec les valeurs générées
        return new Terrain(altitude, hydrometrie, temperature);
    }
}
