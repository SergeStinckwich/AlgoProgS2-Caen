import java.awt.Color;
public class PaquetBataille extends Paquet {
	private String name;

	public boolean greaterThan(Card card1, Card card2){
		return true;
		}

	public PaquetBataille(String name){
		String tab [] = {"7","8","9","10","V","D","R","A"};
        Hauteurs hauteurs = new Hauteurs(tab);
        Symbol trefle = new Symbol("trefle", Color.black);
        Symbol carreau = new Symbol("carreau", Color.red);
        Symbol coeur = new Symbol("coeur", Color.red);
        Symbol pique = new Symbol("pique", Color.black);
        Symbol symboles [] = {trefle, carreau, coeur, pique};
        creePaquet(hauteurs, symboles);
 		this.name = name;
	}

	public static void main(String args[]){
		PaquetBataille monPaquet = new PaquetBataille("Mon paquet");
//		System.out.println(monPaquet.at(0));
//		monPaquet.shuffle();
//		System.out.println(monPaquet.at(0));
	}
}