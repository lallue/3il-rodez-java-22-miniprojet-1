package fr.ecole3il.rodez2023.perlin.test;

import fr.ecole3il.rodez2023.perlin.terrain.visualisation.AltitudeAffichee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test pour la classe AltitudeAffichee.
 */
class AltitudeAfficheeTest {

    /**
     * Teste la méthode getValeurLimite() de la classe AltitudeAffichee.
     * Vérifie que les valeurs limites retournées sont correctes avec une précision de 1e-15.
     */
    @Test
    void testGetValeurLimite() {
        assertEquals(0.33, AltitudeAffichee.BASSE.getValeurLimite(), 1e-15);
        assertEquals(0.66, AltitudeAffichee.MOYENNE.getValeurLimite(), 1e-15);
        assertEquals(1.0, AltitudeAffichee.ELEVEE.getValeurLimite(), 1e-15);
        assertEquals(-1.0, AltitudeAffichee.FOND_MARIN.getValeurLimite(), 1e-15);
    }
}
