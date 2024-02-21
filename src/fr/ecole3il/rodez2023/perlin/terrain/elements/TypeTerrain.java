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
    private final String nomImage;
    /**@Constructor construteur d'un type de terrain*/
    TypeTerrain(String nom, String nomImage) {
        this.nom = nom;
        this.nomImage = nomImage;
    }
    /**@Getter getImage --> permet de récupérer l'image
     * @Getter getNom --> permet de récupérer le nom du terrain
     * @Override toString--> réécriture de la méthode toString pour l'adapter à la demande*/
    public String getNom() {
    	return nom;
    }
    @Override
    public String toString() {
        return "Voici le nom français du terrain: "+nom+" et voici son image associé: "+ nomImage;
    }
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return  Utils.chargerTuile(nomImage);
	}
}