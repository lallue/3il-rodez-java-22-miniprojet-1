package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;

public class VisualiseurTerrainEnonce extends VisualiseurTerrain {
	public VisualiseurTerrainEnonce(Carte c) {
		super(new DetermineurTerrainEnonce(), c);
	}
}
