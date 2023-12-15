package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;

import fr.ecole3il.rodez2023.perlin.Utils;

	 /**
	  *@author alluel	 
	  * Enumération des différents types de terrain avec leurs images associées.
	 */
public enum TypeTerrain {

    COLLINES("Collines", "hills.png"),
    DESERT("Désert", "desert.png"),
    FORET_CONIFERES("Forêt de conifères", "coniferous_forest.png"),
    FORET_FEUILLUS("Forêt de feuillus", "deciduous_forest.png"),
    MARAIS("Marais", "marsh.png"),
    MONTAGNE("Montagne", "mountain.png"),
    OCEAN("Océan", "ocean.png"),
    PLAINE("Plaine", "plain.png"),
    TOUNDRA("Toundra", "tundra.png");

    private final String nom;
    private final BufferedImage image;

    /**
     * Constructeur privé pour chaque type de terrain.
     *
     * @param nom           Le nom du type de terrain.
     * @param cheminImage   Le chemin de l'image associée au type de terrain.
     */
    TypeTerrain(String nom, String cheminImage) {
        this.nom = nom;
        this.image = Utils.chargerTuile("/data/" + cheminImage);
    }

    /**
     * Obtient le nom du type de terrain.
     *
     * @return Le nom du type de terrain.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Obtient l'image associée au type de terrain.
     *
     * @return L'objet BufferedImage.
     */
    public BufferedImage getImage() {
        return image;
    }

    /**
     * Convertit le TypeTerrain en chaîne de caractères.
     *
     * @return Le nom du type de terrain.
     */
    @Override
    public String toString() {
        return nom;
    }
}