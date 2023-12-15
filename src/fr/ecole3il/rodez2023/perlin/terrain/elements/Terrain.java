package fr.ecole3il.rodez2023.perlin.terrain.elements;

/**
 * Classe représentant un terrain avec des informations 
 * sur l'hydrométrie, la température et l'altitude.
 * @author Alluel toujours plus fort que philibert roquart >.<                                                                                   
 */
public class Terrain {

    private double hydrometrie;
    private double temperature;
    private double altitude;

    /**
     * Constructeur de la classe Terrain.
     * @param hydrometrie   Valeur d'hydrométrie du terrain.
     * @param temperature   Valeur de température du terrain.
     * @param altitude      Valeur d'altitude du terrain.
     */
    public Terrain(double hydrometrie, double temperature, double altitude) {
        this.hydrometrie = hydrometrie;
        this.temperature = temperature;
        this.altitude = altitude;
    }

    /**
     * Obtient la valeur d'hydrométrie du terrain.
     * @return La valeur d'hydrométrie.
     */
    public double getHydrometrie() {
        return hydrometrie;
    }

    /**
     * Obtient la valeur de température du terrain.
     * @return La valeur de température.
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Obtient la valeur d'altitude du terrain.
     * @return La valeur d'altitude.
     */
    public double getAltitude() {
        return altitude;
    }
}
