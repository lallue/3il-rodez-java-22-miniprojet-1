package fr.ecole3il.rodez2023.perlin.terrain.generation;


import fr.ecole3il.rodez2023.perlin.math.BruitAleatoire;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

/**
 * La classe GenerateurAleatoire étend la classe abstraite GenerateurCarte
 * et implémente la génération aléatoire d'une carte en utilisant une graine.
 */
public class GenerateurAleatoire extends GenerateurCarte {


    /**
     * Constructeur de la classe GenerateurAleatoire.
     *
     * @param graine La graine pour initialiser le générateur de nombres aléatoires.
     */
    public GenerateurAleatoire(long graine) {
        super(graine);

    }

    /**
     * Génère un terrain aléatoire en fonction des coordonnées spécifiées, de la largeur et de la hauteur.
     *
     */
    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
    	BruitAleatoire bruitAleatoire= new BruitAleatoire(this.getGraine(), 1.0);
        // Génération de valeurs aléatoires pour l'altitude, l'hydrométrie et la température
        double altitude = bruitAleatoire.bruit2D(-1.0, 1.0);
        double hydrometrie = bruitAleatoire.bruit2D(0.0, 1.0);
        double temperature = bruitAleatoire.bruit2D(0.0, 1.0);
        
        return new Terrain(altitude, hydrometrie, temperature);

    }
}
