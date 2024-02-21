package fr.ecole3il.rodez2023.perlin.terrain.carte;

/**
 * Exception levée lorsqu'un terrain demandé n'existe pas dans la carte.
 */
public class TerrainInexistant extends Exception {

    /**
     * Constructeur de la classe TerrainInexistant.
     *
     * @param message Le message décrivant l'exception.
     */
    public TerrainInexistant(String message) {
        super(message);
    }
}
