package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class scenario {
    public static void main(String[] args) {
        Druide panoramix = new Druide("Panoramix", 5, 10);
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Gaulois obelix = new Gaulois("Ob�lix", 25);
        Romain minus = new Romain("Minus", 6);
        
        // Panoramix parle de sa potion
        panoramix.parler("Bonjour, je suis le druide " + panoramix.getNom() + " et ma potion peut aller d'une force " + panoramix.geteffetPotionMin() + " � " + panoramix.geteffetPotionMax() + ".");
        panoramix.parler("Je vais aller pr�parer une petite potion...");

        // Pr�paration de la potion
        panoramix.preparerPotion();

        // Ob�lix ne re�oit pas de potion
        panoramix.booster(obelix);
        obelix.parler("Par B�l�nos, ce n'est pas juste !");
        
        // Ast�rix re�oit la potion
        panoramix.booster(asterix);
        
        // Dialogue final entre Ast�rix et Minus
        asterix.parler("Bonjour");
        minus.parler("UN GAU... UN GAUGAU...");
        
        // Ast�rix frappe Minus
        asterix.frapper(minus);
        // Aucune ligne � ajouter ici pour "J'abandonne", car elle est g�r�e par la m�thode de Romain.
    }
}

