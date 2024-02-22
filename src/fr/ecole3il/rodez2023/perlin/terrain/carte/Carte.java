package fr.ecole3il.rodez2023.perlin.terrain.carte;

import java.util.Scanner;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;

/**
 * Classe représentant une carte avec un nom, une largeur, une hauteur et un tableau de Terrain.
 *
 * @author alluel
 */
public class Carte {

    private String nom;
    private int largeur;
    private int hauteur;
    private Terrain[][] terrains;

    /**
     * Constructeur de la classe Carte utilisant un GenerateurCarte pour créer les terrains.
     *
     * @param nom Le nom de la carte.
     * @param largeur La largeur de la carte.
     * @param hauteur La hauteur de la carte.
     * @param generateurCarte Le générateur de carte utilisé pour créer les terrains.
     */
    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte) {
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.terrains = generateurCarte.genererCarte(largeur, hauteur);
    }

    /**
     * Constructeur de la classe Carte à partir d'une chaîne de caractères représentant les données de la carte.
     *
     * @param donneesCarte La chaîne de caractères représentant les données de la carte.
     */
    public Carte(String donneesCarte) {
        Scanner scanner = new Scanner(donneesCarte);

        this.nom = scanner.nextLine();
        this.largeur = scanner.nextInt();
        this.hauteur = scanner.nextInt();
        scanner.nextLine();

        this.terrains = new Terrain[largeur][hauteur];

        for (int y = 0; y < hauteur; y++) {
            for (int x = 0; x < largeur; x++) {
                double altitude = Double.parseDouble(scanner.next());
                double hydrometrie = Double.parseDouble(scanner.next());
                double temperature = Double.parseDouble(scanner.next());
                terrains[x][y] = new Terrain(altitude, hydrometrie, temperature);
            }
        }

        scanner.close();
    }

    /**
     * Obtient le nom de la carte.
     *
     * @return Le nom de la carte.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Obtient la largeur de la carte.
     *
     * @return La largeur de la carte.
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * Obtient la hauteur de la carte.
     *
     * @return La hauteur de la carte.
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * Obtient le terrain situé à la position [x][y].
     *
     * @param x La coordonnée x.
     * @param y La coordonnée y.
     * @return Le terrain situé à la position [x][y].
     * @throws TerrainInexistant Si la position demandée est invalide.
     */
    public Terrain getTerrain(int x, int y) throws TerrainInexistant {
        if (x < 0 || x >= largeur || y < 0 || y >= hauteur) {
            throw new TerrainInexistant("Terrain inexistant à la position (" + x + ", " + y + ")");
        }
        return terrains[x][y];
    }
}