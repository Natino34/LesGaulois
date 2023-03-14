package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Romain minus = new Romain("Minus",30);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois("Ob�lix",20);
		panoramix.booster(obelix);
		obelix.parler("Par b�l�nos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}
}