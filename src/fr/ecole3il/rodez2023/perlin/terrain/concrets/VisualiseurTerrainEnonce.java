package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;

/**
 * La classe VisualiseurTerrainEnonce est une implémentation concrète de la classe abstraite VisualiseurTerrain.
 * Elle utilise le DetermineurTerrainEnonce pour déterminer le type de terrain à afficher sur la carte.
 */
public class VisualiseurTerrainEnonce extends VisualiseurTerrain {

    /**
     * Constructeur de la classe VisualiseurTerrainEnonce.
     *
     * @param c La carte à visualiser.
     */
    public VisualiseurTerrainEnonce(Carte c) {
        super(new DetermineurTerrainEnonce(), c);
    }
}
