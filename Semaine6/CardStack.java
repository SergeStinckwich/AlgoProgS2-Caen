import java.util.Vector;
public class CardStack {
	private Vector<Card> cards;

	public CardStack(){
		cards = new Vector<Card>(); 
	}

	public Card throwFirstCard(){
		Card first = cards.firstElement();
		cards.removeElementAt(0);
		return first;
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