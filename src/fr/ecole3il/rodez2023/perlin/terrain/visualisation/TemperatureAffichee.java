package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

/**
 * L'énumération TemperatureAffichee représente les différentes plages de température
 * pour l'affichage d'un terrain.
 */
public enum TemperatureAffichee {
    /**
     * Plage de température froide avec une valeur limite de 0.0.
     */
    FROID(0.0),

    /**
     * Plage de température tempérée avec une valeur limite de 10.0.
     */
    TEMPERE(10.0),

    /**
     * Plage de température chaude avec une valeur limite de 20.0.
     */
    CHAUD(20.0);

    /**
     * Valeur limite associée à chaque plage de température.
     */
    private final double valeurLimite;

    /**
     * Constructeur de l'énumération TemperatureAffichee.
     *
     * @param valeurLimite La valeur limite associée à la plage de température.
     */
    TemperatureAffichee(double valeurLimite) {
        this.valeurLimite = valeurLimite;
    }

    /**
     * Obtient la valeur limite associée à la plage de température.
     *
     * @return La valeur limite de la plage de température.
     */
    public double getValeurLimite() {
        return valeurLimite;
    }
}
