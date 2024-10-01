package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois; 
    private int nbVillageois; 

    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois[nbVillageoisMaximum]; 
        this.nbVillageois = 0; 
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterVillageois(Gaulois villageois) {
        this.villageois[nbVillageois] = villageois;
        nbVillageois++;
    }

    public int getNbVillageois() {
        return nbVillageois;
    }
}







