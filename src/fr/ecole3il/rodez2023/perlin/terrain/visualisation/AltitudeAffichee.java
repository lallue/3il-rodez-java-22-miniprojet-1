package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum AltitudeAffichee {
	BASSE(0.33),
    MOYENNE(0.66),
    ELEVEE(1.0),
    FOND_MARIN(-1.0);


    private final double valeurLimite;

    AltitudeAffichee(double valeurLimite) {
        this.valeurLimite = valeurLimite;
    }

    public double getValeurLimite() {
        return valeurLimite;
        
    }
}
