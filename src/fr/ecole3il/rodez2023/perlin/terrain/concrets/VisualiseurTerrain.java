package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.carte.TerrainInexistant;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.AltitudeAffichee;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.HydrometrieAffichee;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.TemperatureAffichee;

/**
 * La classe VisualiseurTerrain permet de visualiser les propriétés du terrain
 * telles que l'altitude, l'hydrométrie, la température, le type de terrain, etc.
 */
public class VisualiseurTerrain {
    private DetermineurTerrain determineurTerrain;
    private Carte carte;

    /**
     * Constructeur de la classe VisualiseurTerrain.
     *
     * @param determineurTerrain L'objet qui détermine le type de terrain.
     * @param carte              La carte à visualiser.
     */
    public VisualiseurTerrain(DetermineurTerrain determineurTerrain, Carte carte) {
        this.determineurTerrain = determineurTerrain;
        this.carte = carte;
    }

    /**
     * Obtient l'altitude affichée pour la position spécifiée.
     *
     * @param x La coordonnée x dans la carte.
     * @param y La coordonnée y dans la carte.
     * @return L'altitude affichée.
     * @throws TerrainInexistant Si le terrain demandé n'existe pas dans la carte.
     */
    public AltitudeAffichee getAltitudeAffichee(int x, int y) throws TerrainInexistant {
        Terrain terrain = carte.getTerrain(x, y);
        double altitude = terrain.getAltitude();

        if (altitude < 0) {
            return AltitudeAffichee.FOND_MARIN;
        } else if (altitude < AltitudeAffichee.BASSE.getValeurLimite()) {
            return AltitudeAffichee.BASSE;
        } else if (altitude < AltitudeAffichee.MOYENNE.getValeurLimite()) {
            return AltitudeAffichee.MOYENNE;
        } else {
            return AltitudeAffichee.ELEVEE;
        }
    }

    /**
     * Obtient l'hydrométrie affichée pour la position spécifiée.
     *
     * @param x La coordonnée x dans la carte.
     * @param y La coordonnée y dans la carte.
     * @return L'hydrométrie affichée.
     * @throws TerrainInexistant Si le terrain demandé n'existe pas dans la carte.
     */
    public HydrometrieAffichee getHydrometrieAffichee(int x, int y) throws TerrainInexistant {
        Terrain terrain = carte.getTerrain(x, y);
        double hydrometrie = terrain.getHydrometrie();

        if (hydrometrie < HydrometrieAffichee.SEC.getValeurLimite()) {
            return HydrometrieAffichee.SEC;
        } else if (hydrometrie < HydrometrieAffichee.MOYEN.getValeurLimite()) {
            return HydrometrieAffichee.MOYEN;
        } else {
            return HydrometrieAffichee.HUMIDE;
        }
    }

    /**
     * Obtient la température affichée pour la position spécifiée.
     *
     * @param x La coordonnée x dans la carte.
     * @param y La coordonnée y dans la carte.
     * @return La température affichée.
     * @throws TerrainInexistant Si le terrain demandé n'existe pas dans la carte.
     */
    public TemperatureAffichee getTemperatureAffichee(int x, int y) throws TerrainInexistant {
        Terrain terrain = carte.getTerrain(x, y);
        double temperature = terrain.getTemperature();

        if (temperature < TemperatureAffichee.FROID.getValeurLimite()) {
            return TemperatureAffichee.FROID;
        } else if (temperature < TemperatureAffichee.TEMPERE.getValeurLimite()) {
            return TemperatureAffichee.TEMPERE;
        } else {
            return TemperatureAffichee.CHAUD;
        }
    }

    /**
     * Obtient le type de terrain pour la position spécifiée en utilisant le détermineur de terrain.
     *
     * @param x La coordonnée x dans la carte.
     * @param y La coordonnée y dans la carte.
     * @return Le type de terrain.
     * @throws TerrainInexistant Si le terrain demandé n'existe pas dans la carte.
     */
    public TypeTerrain getTypeTerrain(int x, int y) throws TerrainInexistant {
        Terrain terrain = carte.getTerrain(x, y);
        TypeTerrain typeTerrain = determineurTerrain.determinerTerrain(terrain.getAltitude(), terrain.getHydrometrie(), terrain.getTemperature());
        return typeTerrain;
    }

    /**
     * Obtient le détermineur de terrain utilisé par le visualiseur.
     *
     * @return Le détermineur de terrain.
     */
    public DetermineurTerrain getDetermineurTerrain() {
        return determineurTerrain;
    }

    /**
     * Obtient la carte utilisée par le visualiseur.
     *
     * @return La carte.
     */
    public Carte getCarte() {
        return carte;
    }
}
