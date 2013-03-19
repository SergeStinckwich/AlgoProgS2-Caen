public class Game{

public static void main(String args[]){
	
	int numberOfPlayer = 2;

	System.out.println("Initialisation du paquet de cartes ...");
	WarDeck deck = new WarDeck("War Card Game Deck");
	deck.shuffle();

	System.out.println("Création des tas de cartes pour chaque joueur ...");
	CardStack playerCardStack[] = new CardStack[2];
	playerCardStack[0] = new CardStack();
	playerCardStack[1] = new CardStack();

	System.out.println("Distribution des cartes aux joueurs ...");
	int k = 0;
	for (int i=0; i<deck.cardsNumber(); i++){
		playerCardStack[k].addCard(deck.at(i));
		k++; if (k==2) k=0;
	}

	System.out.println("Démarrage du jeu ...");


}
}