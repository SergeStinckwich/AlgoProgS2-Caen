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

	Card card0, card1;
	System.out.println("Démarrage du jeu ...");
	while((!playerCardStack[0].isEmpty())&&(!playerCardStack[1].isEmpty()))
	{
		card0 = playerCardStack[0].throwFirstCard();
		card1 = playerCardStack[1].throwFirstCard();

		System.out.println("Joueur 1 joue: "+ card0);
		System.out.println("Joueur 2 joue: "+ card1);
		if (deck.greaterThan(card0, card1))
			{
				System.out.println("Joueur 1 gagne la bataille.");
				playerCardStack[0].addCard(card0);
				playerCardStack[0].addCard(card1);
			}
			else
			{
			System.out.println("Joueur 2 gagne la bataille.");
			playerCardStack[1].addCard(card0);
			playerCardStack[1].addCard(card1);
		}

	}
	if (playerCardStack[0].isEmpty())
		System.out.println("Le joueur 2 a gagné la partie.");
	else
		System.out.println("Le joueur 1 a gagné la partie.");
}
}