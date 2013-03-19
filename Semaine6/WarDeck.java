import java.awt.Color;
public class WarDeck extends Deck {
	private String name;

	public boolean greaterThan(Card card1, Card card2){
		 return (this.getHauteurs())
		 			.greaterThan(card1.getHauteur(), card2.getHauteur());
		}

	public boolean equals(Card card1, Card card2){
		return (card1.getHauteur()).equals(card2.getHauteur());
	}

	public WarDeck(String name){
		String tab [] = {"7","8","9","10","V","D","R","A"};
        Hauteurs hauteurs = new Hauteurs(tab);
        Symbol trefle = new Symbol("trefle", Color.black);
        Symbol carreau = new Symbol("carreau", Color.red);
        Symbol coeur = new Symbol("coeur", Color.red);
        Symbol pique = new Symbol("pique", Color.black);
        Symbol symboles [] = {trefle, carreau, coeur, pique};
        buildDeck(hauteurs, symboles);
 		this.name = name;
 	}

	public static void main(String args[]){
		WarDeck myDeck = new WarDeck("Un paquet pour le jeu de la bataille");
		myDeck.shuffle();
	}
}