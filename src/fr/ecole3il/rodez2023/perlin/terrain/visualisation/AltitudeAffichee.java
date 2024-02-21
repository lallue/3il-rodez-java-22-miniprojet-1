package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

/**
 * L'énumération AltitudeAffichee représente les différentes altitudes possibles
 * pour l'affichage d'un terrain.
 */
public enum AltitudeAffichee {
    /**
     * Altitude basse avec une valeur limite de 0.33.
     */
    BASSE(0.33),

    /**
     * Altitude moyenne avec une valeur limite de 0.66.
     */
    MOYENNE(0.66),

    /**
     * Altitude élevée avec une valeur limite de 1.0.
     */
    ELEVEE(1.0),

    /**
     * Altitude spéciale pour le fond marin avec une valeur limite de -1.0.
     */
    FOND_MARIN(-1.0);

    /**
     * Valeur limite associée à chaque altitude.
     */
    private final double valeurLimite;

    /**
     * Constructeur de l'énumération AltitudeAffichee.
     *
     * @param valeurLimite La valeur limite associée à l'altitude.
     */
    AltitudeAffichee(double valeurLimite) {
        this.valeurLimite = valeurLimite;
    }

    /**
     * Obtient la valeur limite associée à l'altitude.
     *
     * @return La valeur limite de l'altitude.
     */
    public double getValeurLimite() {
        return valeurLimite;
    }
}
