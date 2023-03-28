package personnages;


public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	
	public void setChef(Chef chef) {
		this.chef=chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois+=1;
	}
	
	public Gaulois trouverHabitant(int indice) {
		return villageois[indice];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les l�genfaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + trouverHabitant(i).getNom());
		}
		
	}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irr�ductibles",30);
//		Gaulois gaulois = village.trouverHabitant(30);
//      indice trop grand
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		r�ponse "null" car aucun gaulois n'est � l'indice 1, asterix est � l'indice 0
		village.afficherVillageois();
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}

}
