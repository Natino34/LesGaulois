package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipements[] = new Equipement[2];
	private int nbEquipement = 0;
	private String texte;

	public Romain(String nom, int force) {
		assert force > 0;
		this.nom = nom;
		this.force = force;
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	private void equiperEquip(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement += 1;
		System.out.println("Le soldat " + nom + " s'�quipe avec un " + equipement + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + " �");
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int forcemem = force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		assert forcemem > force;
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est d�j� bien prot�g� !");
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " poss�de d�j� un " + equipement + ".");
			} else {
				equiperEquip(equipement);
			}
			break;
		default:
			equiperEquip(equipement);
			break;
		}
	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// pr�condition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		switch (force) {
		case 0:
			parler("A�e");
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
			}
			// post condition la force a diminu�e
			assert force < oldForce;
			return equipementEjecte;
		}


	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.parler("Rendez-vous !");
		minus.recevoirCoup(4);
		minus.recevoirCoup(1);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
}
