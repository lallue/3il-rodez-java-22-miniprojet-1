package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;

import fr.ecole3il.rodez2023.perlin.Utils;

/**
 * L'énumération TypeTerrain représente les différents types de terrain avec leurs images associées.
 * Chaque type de terrain est défini par un nom et le nom de l'image représentative.
 * L'énumération fournit également des méthodes pour récupérer le nom et l'image associée à chaque type de terrain.
 * L'auteur de cette énumération est mentionné comme "alluel".
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

    /**
     * Constructeur de l'énumération TypeTerrain.
     *
     * @param nom      Le nom du type de terrain.
     * @param nomImage Le nom de l'image associée au type de terrain.
     */
    TypeTerrain(String nom, String nomImage) {
        this.nom = nom;
        this.nomImage = nomImage;
    }

    /**
     * Permet de récupérer le nom du type de terrain.
     *
     * @return Le nom du type de terrain.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Permet de récupérer l'image associée au type de terrain.
     *
     * @return L'image associée au type de terrain sous forme de BufferedImage.
     */
    public BufferedImage getImage() {
        return Utils.chargerTuile(nomImage);
    }

    /**
     * Réécriture de la méthode toString pour adapter l'affichage du type de terrain.
     *
     * @return Une chaîne de caractères représentant le nom français du terrain et son image associée.
     */
    @Override
    public String toString() {
        return "Voici le nom français du terrain : " + nom + " et voici son image associée : " + nomImage;
    }
}
