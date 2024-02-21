package fr.ecole3il.rodez2023.perlin.terrain.elements;

/**
 * La classe MauvaiseValeurException est une sous-classe d'IllegalArgumentException
 * utilisée pour signaler une exception liée à des valeurs incorrectes dans le contexte
 * des éléments du terrain.
 */
public class MauvaiseValeurException extends IllegalArgumentException {

    /**
     * Constructeur de la classe MauvaiseValeurException.
     *
     * @param message Le message décrivant l'exception.
     */
    public MauvaiseValeurException(String message) {
        super(message);
    }
}
