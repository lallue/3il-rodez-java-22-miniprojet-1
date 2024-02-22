package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

/**
 * La classe DetermineurTerrainEnonce est une implémentation concrète de l'interface DetermineurTerrain.
 * Elle détermine le type de terrain en fonction des valeurs d'altitude, d'hydrométrie et de température.
 */
public class DetermineurTerrainEnonce implements DetermineurTerrain {

    /**
     * Méthode qui détermine le type de terrain en fonction des valeurs d'altitude, d'hydrométrie et de température.
     *
     * @param altitude     La valeur d'altitude du terrain.
     * @param hydrometrie   La valeur d'hydrométrie du terrain.
     * @param temperature  La valeur de température du terrain.
     * @return Le type de terrain déterminé.
     */
    @Override
    public TypeTerrain determinerTerrain(double altitude, double hydrometrie, double temperature) {
    	if (altitude < 0) {
            return TypeTerrain.OCEAN;
        } else if (hydrometrie <= 0.25) {
            if (altitude <= 0.7) {
                if (temperature <= 0.25) {
                    return TypeTerrain.PLAINE;
                } else if (temperature <= 0.7) {
                    return TypeTerrain.FORET_FEUILLUS;
                } else {
                    return TypeTerrain.TOUNDRA;
                }
            } else {
                if (temperature <= 0.25) {
                    return TypeTerrain.PLAINE;
                } else if (temperature <= 0.7) {
                    return TypeTerrain.FORET_CONIFERES;
                } else {
                    return TypeTerrain.MONTAGNE;
                }
            }
        } else {
            if (altitude > 0.7) {
                if (temperature <= 0.25) {
                    return TypeTerrain.DESERT;
                } else if (temperature <= 0.7) {
                    return TypeTerrain.COLLINES;
                } else {
                    return TypeTerrain.MONTAGNE;
                }
            } else {
                if (temperature <= 0.25) {
                    return TypeTerrain.MARAIS;
                } else if (temperature <= 0.7) {
                    return TypeTerrain.FORET_CONIFERES;
                } else {
                    return TypeTerrain.MONTAGNE;
                }
            }
        }
    }
}
