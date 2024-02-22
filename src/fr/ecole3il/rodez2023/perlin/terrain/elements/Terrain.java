package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

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
     * Constructeur de la classe Terrain avec gestion des valeurs par setters.
     *
     * @param hydrometrie   Valeur d'hydrométrie du terrain.
     * @param temperature   Valeur de température du terrain.
     * @param altitude      Valeur d'altitude du terrain.
     */
    public Terrain(double hydrometrie, double temperature, double altitude) {
    	setHydrometrie(hydrometrie);
        setTemperature(temperature);
        setAltitude(altitude); 
    }

    /**
     * Obtient la valeur d'hydrométrie du terrain.
     *
     * @return La valeur d'hydrométrie.
     */
    public double getHydrometrie() {
        return hydrometrie;
    }

    /**
     * Obtient la valeur de température du terrain.
     *
     * @return La valeur de température.
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Obtient la valeur d'altitude du terrain.
     *
     * @return La valeur d'altitude.
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * Setter pour la valeur d'hydrométrie du terrain avec gestion des erreurs.
     *
     * @param hydrometrie La nouvelle valeur d'hydrométrie.
     * @throws MauvaiseValeurException Si la valeur est en dehors de la plage autorisée [0, 1].
     */
    public void setHydrometrie(double hydrometrie) {
    	hydrometrie = Math.abs(hydrometrie);
        if (hydrometrie < 0 || hydrometrie > 1) {
            throw new MauvaiseValeurException("L'hydrométrie doit être comprise entre 0 et 1.");
        }
        this.hydrometrie = hydrometrie;
    }

    /**
     * Setter pour la valeur de température du terrain avec gestion des erreurs.
     *
     * @param temperature La nouvelle valeur de température.
     * @throws MauvaiseValeurException Si la valeur est en dehors de la plage autorisée [0, 1].
     */
    public void setTemperature(double temperature) {
    	temperature = Math.abs(temperature);
        if (temperature < 0 || temperature > 1) {
            throw new MauvaiseValeurException("La température doit être comprise entre 0 et 1.");
        }
        this.temperature = temperature;
    }

    /**
     * Setter pour la valeur d'altitude du terrain avec gestion des erreurs.
     *
     * @param altitude La nouvelle valeur d'altitude.
     * @throws MauvaiseValeurException Si la valeur est en dehors de la plage autorisée [-1, 1].
     */
    public void setAltitude(double altitude) {
        if (altitude < -1 || altitude > 1) {
            throw new MauvaiseValeurException("L'altitude doit être comprise entre -1 et 1.");
        }
        this.altitude = altitude;
    }

    /**
     * Méthode getTypeTerrain pour déterminer le type de terrain en utilisant un DetermineurTerrain.
     *
     * @param dt Le determineur de terrain.
     * @return Le type de terrain.
     */
    public TypeTerrain getTypeTerrain(DetermineurTerrain dt) {
        return dt.determinerTerrain(altitude, hydrometrie, temperature);
    }
}
