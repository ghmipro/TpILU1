package personnages;

public class Gaulois {
    private String nom;
    private int force;
    private int effetPotion = 1; 

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getEffetPotion() {
        return effetPotion;
    }

    public String getNom() {
        return nom;
    }
    
    public void parler(String texte) {
        System.out.println(prendreParole() + "� " + texte + "�");
    }

    public void setEffetPotion(int effetPotion) {
        this.effetPotion = effetPotion;
    }
    
    private String prendreParole() {
        return "Le gaulois " + nom + " : ";
    }
    
    
    public void boirePotion(int forcePotion) {
        this.effetPotion = forcePotion; 
        parler("Merci Druide, je sens que ma force est " + effetPotion + " fois d�cupl�e.");
    }
    
    
    public void frapper(Romain romain) {
        System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
      
        romain.recevoirCoup((force / 3) * effetPotion);
    }

    @Override
    public String toString() {
        return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
    }
    
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        System.out.println(asterix);
        
       
        int forcePotion = 5;
        asterix.boirePotion(forcePotion); 
        
       
        Romain minus = new Romain("Minus", 6);
        asterix.frapper(minus); 
    }
}
