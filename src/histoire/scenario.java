package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class scenario {
    public static void main(String[] args) {
        Druide panoramix = new Druide("Panoramix", 5, 10);
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 25);
        Romain minus = new Romain("Minus", 6);
        
        // Panoramix parle de sa potion
        panoramix.parler("Bonjour, je suis le druide " + panoramix.getNom() + " et ma potion peut aller d'une force " + panoramix.geteffetPotionMin() + " à " + panoramix.geteffetPotionMax() + ".");
        panoramix.parler("Je vais aller préparer une petite potion...");

        // Préparation de la potion
        panoramix.preparerPotion();

        // Obélix ne reçoit pas de potion
        panoramix.booster(obelix);
        obelix.parler("Par Bélénos, ce n'est pas juste !");
        
        // Astérix reçoit la potion
        panoramix.booster(asterix);
        
        // Dialogue final entre Astérix et Minus
        asterix.parler("Bonjour");
        minus.parler("UN GAU... UN GAUGAU...");
        
        // Astérix frappe Minus
        asterix.frapper(minus);
        // Aucune ligne à ajouter ici pour "J'abandonne", car elle est gérée par la méthode de Romain.
    }
}

