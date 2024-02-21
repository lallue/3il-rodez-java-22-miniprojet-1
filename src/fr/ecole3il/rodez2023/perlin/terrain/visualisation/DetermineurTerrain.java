package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

/**
 * L'interface DetermineurTerrain définit la méthode permettant de déterminer le type de terrain
 * en fonction de l'altitude, de l'hydrométrie et de la température.
 */
public interface DetermineurTerrain {

    /**
     * Méthode permettant de déterminer le type de terrain en fonction de certains paramètres.
     *
     * @param altitude     L'altitude du terrain.
     * @param hydrometrie   L'hydrométrie du terrain.
     * @param temperature   La température du terrain.
     * @return Le type de terrain déterminé.
     */
    TypeTerrain determinerTerrain(double altitude, double hydrometrie, double temperature);
}
