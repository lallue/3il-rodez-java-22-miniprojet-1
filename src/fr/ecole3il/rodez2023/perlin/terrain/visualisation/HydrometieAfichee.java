package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

/*
* @ResteCode Gestion des valeurs
*/
public enum HydrometieAfichee {
   SEC(0.33),
   MOYEN(0.66),
   HUMIDE(1.0);

   /** Gestion des valeurs */
   private final double valeurLimite;

   /**
    * Constructeur privé pour initialiser chaque valeur avec sa limite associée.
    *
    * @param valeurLimite La limite associée à la valeur.
    */
   HydrometieAfichee(double valeurLimite) {
       this.valeurLimite = valeurLimite;
   }

   /**
    * Obtient la valeur limite associée à l'élément d'énumération.
    *
    * @return La valeur limite associée à l'élément d'énumération.
    */
   public double getValeurLimite() {
       return valeurLimite;
   }
}
