package fr.ecole3il.rodez2023.perlin.terrain.generation;

import java.util.Random;

import fr.ecole3il.rodez2023.perlin.terrain.elements.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

/**
 * La classe GenerateurAleatoire étend la classe abstraite GenerateurCarte
 * et implémente la génération aléatoire d'une carte en utilisant une graine.
 */
public class GenerateurAleatoire extends GenerateurCarte {

    // Générateur de nombres aléatoires
    private Random random;

    /**
     * Constructeur de la classe GenerateurAleatoire.
     *
     * @param graine La graine pour initialiser le générateur de nombres aléatoires.
     */
    public GenerateurAleatoire(long graine) {
        super(graine);
        this.random = new Random();
    }

    /**
     * Génère un terrain aléatoire en fonction des coordonnées spécifiées, de la largeur et de la hauteur.
     *
     * @param i        Coordonnée x de la position dans la carte.
     * @param j        Coordonnée y de la position dans la carte.
     * @param largeur  Largeur de la carte.
     * @param hauteur  Hauteur de la carte.
     * @return Un objet Terrain généré aléatoirement.
     */
    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) {
        // Génération de valeurs aléatoires pour l'altitude, l'hydrométrie et la température
        double altitude = this.random.nextDouble(-1.0, 1.0);
        double hydrometrie = this.random.nextDouble(0.0, 1.0);
        double temperature = this.random.nextDouble(0.0, 1.0);

        try {
            // Création d'un objet Terrain avec les valeurs générées
            return new Terrain(altitude, hydrometrie, temperature);
        } catch (MauvaiseValeurException e) {
            // En cas d'erreur, afficher la trace de la pile et retourner null
            e.printStackTrace();
            return null;
        }
    }
}
