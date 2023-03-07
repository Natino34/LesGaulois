package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin = 2;
	private int effetPotionMax = 5;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.setEffetPotionMin(effetPotionMin);
		this.setEffetPotionMax(effetPotionMax);
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " 
				+ effetPotionMin + " à " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public void setEffetPotionMin(int effetPotionMin) {
		this.effetPotionMin = effetPotionMin;
	}

	public int getEffetPotionMax() {
		return effetPotionMax;
	}

	public void setEffetPotionMax(int effetPotionMax) {
		this.effetPotionMax = effetPotionMax;
	}
}