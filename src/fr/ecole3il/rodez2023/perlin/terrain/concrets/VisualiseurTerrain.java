package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.carte.TerrainInexistant;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.AltitudeAffichee;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.HydrometrieAffichee;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.TemperatureAffichee;

public class VisualiseurTerrain {
    private DetermineurTerrain determineurTerrain;
    private Carte carte;

    public VisualiseurTerrain(DetermineurTerrain determineurTerrain, Carte carte) {
        this.determineurTerrain = determineurTerrain;
        this.carte = carte;
    }

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

    public TypeTerrain getTypeTerrain(int x, int y) throws TerrainInexistant {
        Terrain terrain = carte.getTerrain(x, y);
        TypeTerrain typeTerrain = determineurTerrain.determinerTerrain(terrain.getAltitude(), terrain.getHydrometrie(), terrain.getTemperature());
        return typeTerrain;
    }

    public DetermineurTerrain getDetermineurTerrain() {
        return determineurTerrain;
    }

    public Carte getCarte() {
        return carte;
    }
}
