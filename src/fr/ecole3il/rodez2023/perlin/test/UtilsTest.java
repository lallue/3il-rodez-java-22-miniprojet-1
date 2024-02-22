package fr.ecole3il.rodez2023.perlin.test;

import fr.ecole3il.rodez2023.perlin.Utils;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test pour la classe Utils.
 */
class UtilsTest {

    /**
     * Classe imbriquée pour tester la méthode statique min de la classe Utils.
     */
    @Nested
    class MinTest {

        /**
         * Teste la méthode min avec la largeur en tant que valeur minimale.
         * Vérifie que la méthode renvoie la valeur minimale correcte.
         */
        @Test
        void min_widthIsMin() {
            assertEquals(1, Utils.min(1, 3));
        }

        /**
         * Teste la méthode min avec la hauteur en tant que valeur minimale.
         * Vérifie que la méthode renvoie la valeur minimale correcte.
         */
        @Test
        void min_heightIsMin() {
            assertEquals(1, Utils.min(3, 1));
        }
    }
}
