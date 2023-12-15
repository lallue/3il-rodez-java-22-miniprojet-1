package fr.ecole3il.rodez2023.perlin.terrain.elements;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

 /**
 * Enumération des différents types de terrain avec leurs images associées.
 * @author alluel
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
    private final String cheminImage;
    private BufferedImage image;

    /**
     * Constructeur privé pour chaque type de terrain.
     *
     * @param nom           Le nom du type de terrain.
     * @param cheminImage   Le chemin de l'image associée au type de terrain.
     */
    TypeTerrain(String nom, String cheminImage) {
        this.nom = nom;
        this.cheminImage = cheminImage;
        try {
            InputStream inputStream = getClass().getResourceAsStream("/data/" + cheminImage);
            this.image = ImageIO.read(inputStream);
        } catch (IOException e) {
            e.printStackTrace(); // Gérer les erreurs de chargement d'image
        }
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
     * Obtient le chemin de l'image associée au type de terrain.
     *
     * @return Le chemin de l'image.
     */
    public String getCheminImage() {
        return cheminImage;
    }

    /**
     * Obtient l'image associée au type de terrain.
     *
     * @return L'objet BufferedImage.
     */
    public BufferedImage getImage() {
        return image;
    }
}
