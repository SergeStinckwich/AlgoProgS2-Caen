import java.util.Vector;
public class CardStack {
	private Vector<Card> cards;

	public CardStack(){
		cards = new Vector<Card>(); 
	}

	public Card firstCard(){
		return cards.firstElement();
	}

	public boolean isEmpty(){
		return cards.isEmpty();
	}

	public void addCard(Card c){
		cards.add(c);
	}

	public String toString(){
		return "TBD";
	}

}