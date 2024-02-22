package fr.ecole3il.rodez2023.perlin.math;

import java.util.Random;

/**
 * La classe BruitAleatoire étend la classe Bruit2D et génère du bruit aléatoire en deux dimensions.
 * Elle utilise la classe Random de Java pour générer des valeurs aléatoires.
 */
public class BruitAleatoire extends Bruit2D {
	private final Random random;
    /**
     * Constructeur de la classe BruitAleatoire.
     * @param graine La graine utilisée pour initialiser le générateur de bruit.
     * @param resolution La résolution utilisée pour la génération du bruit.
     */
    public BruitAleatoire(long graine, double resolution) {
        // Appel du constructeur de la classe mère avec la graine et la résolution
        super(graine, resolution);
        this.random = new Random();
    }

    /**
     * Méthode qui génère du bruit aléatoire en deux dimensions.
     * Cette méthode ne dépend pas des coordonnées x et y.
     * @param x Coordonnée x
     * @param y Coordonnée y
     * @return Valeur de bruit aléatoire entre 0.0 (inclus) et 1.0 (exclus).
     */
    
    @Override
    public double bruit2D(double x, double y) {
        // Utilisation de la classe Random pour générer du bruit aléatoire
        return random.nextDouble(x,y);
    }
}
